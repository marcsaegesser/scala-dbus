package dbus

import scalaz._,Scalaz._
import org.scalatest._
import dbus._

class IntrospectUnitTests extends WordSpec with ShouldMatchers {
  import DBus._
  import IntrospectHierarchy._

  "IntrospectHeirarchy" should {
    "find existing nodes" in {
      val hierarchy = addObject(addObject(Empty, "/a/b/c/d/One", "onedata"), "/a/b/c/Two", "twodata")
      lookupNode(hierarchy, "/a/b/c/d/One") map { _ map { _.show.toString } } should equal (Some(List("onedata")))
      lookupNode(hierarchy, "/a/b/c/Two") map { _ map { _.show.toString } } should equal (Some(List("twodata")))
    }

    "find internal nodes" in {
      val hierarchy = addObject(addObject(Empty, "/a/b/c/d/One", "onedata"), "/a/b/c/Two", "twodata")
      lookupNode(hierarchy, "/a/b/c") map { _.map(_.name).toSet } should equal (Some(Set("d", "Two")))
    }

    "not find missing nodes" in {
      val hierarchy = addObject(addObject(Empty, "/a/b/c/d/One", "onedata"), "/a/b/c/Two", "twodata")
      lookupNode(hierarchy, "/a/b/c/d/e/f/g") should be (None)
    }
  }

}
