Running sbt
[info] Loading global plugins from /home/marc/.sbt/0.13/plugins
[info] Loading project definition from /home/marc/work/scala-dbus/project
[info] Set current project to Scala-DBus (in build file:/home/marc/work/scala-dbus/)
> test:console
[info] Starting scala interpreter...
[info] 
import scalaz._
import Scalaz._
import dbus._
import DBus._
import scodec.bits._
Welcome to Scala version 2.11.7 (OpenJDK 64-Bit Server VM, Java 1.7.0_95).
Type in expressions to have them evaluated.
Type :help for more information.

scala> val m = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss")),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    FieldVariant(FieldUnixFD(-1702340653)),
    FieldVariant(FieldUnixFD(-1)),
    FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    FieldVariant(FieldInt16(0)),
    FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22)))))
     | <console>:30: error: type mismatch;
 found   : String("nxdxsydygoybqobogitguyuqyynobnsxhtquhss")
 required: dbus.DBus.Signature
           FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss")),
                                       ^

scala> 
scala> val m = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    FieldVariant(FieldUnixFD(-1702340653)),
    FieldVariant(FieldUnixFD(-1)),
    FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    FieldVariant(FieldInt16(0)),
    FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22)))))
     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      | m: scala.collection.immutable.Vector[dbus.DBus.FieldArray] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezua...
scala> 
scala> m
res0: scala.collection.immutable.Vector[dbus.DBus.FieldArray] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6e...
scala> val s = messageSignature(m)
s: scalaz.\/[Throwable,dbus.DBus.Signature] = \/-(av)

scala> val s = messageSignature_(m)
s: dbus.DBus.Signature = av

scala> marshal(m)
<console>:27: error: could not find implicit value for evidence parameter of type scalaz.Foldable[Any]
Error occurred in an application involving default arguments.
       marshal(m)
              ^

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    FieldVariant(FieldUnixFD(-1702340653)),
    FieldVariant(FieldUnixFD(-1)),
    FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    FieldVariant(FieldInt16(0)),
    FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22)))))
     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> marshal(m)
res2: scalaz.\/[Throwable,scodec.bits.BitVector] = \/-(BitVector(52400 bits, #-331642374))

scala> marshal_(m)
res3: scodec.bits.BitVector = BitVector(52400 bits, #-331642374)

scala> unmarshal_(s, res3)
java.lang.IllegalArgumentException: UTF-8 cannot decode string from '0x6b39d5016f0000000006be2f61376c566b792f7972757967536c44706736636570616d61477639686d532f626970656570766866397567796a6f41646876766762727a656234397763386d65717261616e6946662f707a796a46753751672f7a7633466e6c33717773656c4a5464776862372f736b74796a75625a656658723173616241'
  at scodec.Attempt$Failure.require(Attempt.scala:122)
  at scodec.Attempt$Failure.require(Attempt.scala:108)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:169)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:168)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:33)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:32)
  at scalaz.Monad$$anonfun$map$1$$anonfun$apply$2.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.point(Id.scala:18)
  at scalaz.Monad$$anonfun$map$1.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.Monad$class.map(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.map(Id.scala:17)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:72)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:71)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.Iterator$class.foreach(Iterator.scala:742)
  at scala.collection.AbstractIterator.foreach(Iterator.scala:1194)
  at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
  at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
  at scala.collection.TraversableOnce$class.foldLeft(TraversableOnce.scala:155)
  at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:71)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:70)
  at scalaz.package$State$$anon$3.apply(package.scala:155)
  at scalaz.package$State$$anon$3.apply(package.scala:154)
  at scalaz.IndexedStateT$class.run(StateT.scala:10)
  at scalaz.package$State$$anon$3.run(package.scala:154)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at scalaz.DisjunctionFunctions$class.fromTryCatchNonFatal(Either.scala:496)
  at scalaz.$bslash$div$.fromTryCatchNonFatal(Either.scala:332)
  at dbus.Marshal$class.unmarshal(Marshal.scala:139)
  at dbus.DBus$.unmarshal(DBus.scala:15)
  at dbus.Marshal$class.unmarshal_(Marshal.scala:145)
  at dbus.DBus$.unmarshal_(DBus.scala:15)
  ... 43 elided

scala> val m = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    FieldVariant(FieldUnixFD(-1702340653)),
    FieldVariant(FieldUnixFD(-1)),
    FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    FieldVariant(FieldInt16(0)),
    FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22)))))
     | m: scala.collection.immutable.Vector[dbus.DBus.FieldArray] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezua...
scala> unmarshal_(messageSignature_(m), marshal_(m))
<console>:27: error: could not find implicit value for evidence parameter of type scalaz.Foldable[Any]
       unmarshal_(messageSignature_(m), marshal_(m))
                                                ^

scala> val m: Vector[Field] = Vector(
     | 
     |   FieldArray(TypeVariant,Vector(
     | 
     |     FieldVariant(FieldInt32(2147483647)),
     | 
     |     FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
     | 
     |     FieldVariant(FieldInt16(-5409)),
     | 
     |     FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
     | 
     |     FieldVariant(FieldWord16(0)),
     | 
     |     FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
     | 
     |     FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
     | 
     |     // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
     | 
     |     FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
     | 
    FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
     | 
     |     FieldVariant(FieldUnixFD(-1702340653)),
     | 
     |     FieldVariant(FieldUnixFD(-1)),
     | 
     |     FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
     | 
     |     FieldVariant(FieldDouble(-3.4470417411321385E-4)),
     | 
     |     FieldVariant(FieldInt16(0)),
     | 
    FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),

    FieldVariant(FieldWord16(32767)),
     |      |      | 
    FieldVariant(FieldWord8(22)))))
     |      | 
m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> 
scala> 
scala> 
scala> 
scala> 
scala> 
scala> 
scala> 
scala> 
scala> 
scala> 
scala> 
scala> 
scala> unmarshal_(messageSignature_(m), marshal_(m))
java.util.NoSuchElementException: head of empty list
  at scala.collection.immutable.Nil$.head(List.scala:420)
  at scala.collection.immutable.Nil$.head(List.scala:417)
  at dbus.Marshal$$anonfun$readType$1$1.apply(Marshal.scala:243)
  at dbus.Marshal$$anonfun$readType$1$1.apply(Marshal.scala:242)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:33)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:32)
  at scalaz.Monad$$anonfun$map$1$$anonfun$apply$2.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.point(Id.scala:18)
  at scalaz.Monad$$anonfun$map$1.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.Monad$class.map(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.map(Id.scala:17)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:72)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:71)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.Iterator$class.foreach(Iterator.scala:742)
  at scala.collection.AbstractIterator.foreach(Iterator.scala:1194)
  at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
  at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
  at scala.collection.TraversableOnce$class.foldLeft(TraversableOnce.scala:155)
  at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:71)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:70)
  at scalaz.package$State$$anon$3.apply(package.scala:155)
  at scalaz.package$State$$anon$3.apply(package.scala:154)
  at scalaz.IndexedStateT$class.run(StateT.scala:10)
  at scalaz.package$State$$anon$3.run(package.scala:154)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at scalaz.DisjunctionFunctions$class.fromTryCatchNonFatal(Either.scala:496)
  at scalaz.$bslash$div$.fromTryCatchNonFatal(Either.scala:332)
  at dbus.Marshal$class.unmarshal(Marshal.scala:139)
  at dbus.DBus$.unmarshal(DBus.scala:15)
  at dbus.Marshal$class.unmarshal_(Marshal.scala:145)
  at dbus.DBus$.unmarshal_(DBus.scala:15)
  ... 43 elided

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    // FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    // FieldVariant(FieldInt16(-5409)),
    // FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    // FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),
    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22)))))
     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldWord8(22)))))

scala> unmarshal_(messageSignature_(m), marshal_(m))
res7: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldWord8(22)))))

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    // FieldVariant(FieldInt16(-5409)),
    // FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    // FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),
    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22)))))
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
res8: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedf...
scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    // FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    // FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),
    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22)))))
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
res9: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedf...
scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    // FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),
    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22)))))
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
res10: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyved...
scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),
    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    // FieldVariant(FieldWord8(22))))
)
     | <console>:21: error: illegal start of simple expression
)
^

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),
    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
res11: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyved...
scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),
    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
res12: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyved...
scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),
    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),
    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
res13: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyved...
scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    FieldVariant(FieldUnixFD(-1702340653)),
    FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
java.lang.IllegalArgumentException: UTF-8 cannot decode string from '0x6b39d5016f0000000006be2f61376c566b792f7972757967536c44706736636570616d61477639686d532f626970656570766866397567796a6f41646876766762727a656234397763386d65717261616e6946662f707a796a46753751672f7a7633466e6c33717773656c4a5464776862372f736b74796a75625a656658723173616241'
  at scodec.Attempt$Failure.require(Attempt.scala:122)
  at scodec.Attempt$Failure.require(Attempt.scala:108)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:169)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:168)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:33)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:32)
  at scalaz.Monad$$anonfun$map$1$$anonfun$apply$2.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.point(Id.scala:18)
  at scalaz.Monad$$anonfun$map$1.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.Monad$class.map(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.map(Id.scala:17)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:72)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:71)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.Iterator$class.foreach(Iterator.scala:742)
  at scala.collection.AbstractIterator.foreach(Iterator.scala:1194)
  at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
  at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
  at scala.collection.TraversableOnce$class.foldLeft(TraversableOnce.scala:155)
  at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:71)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:70)
  at scalaz.package$State$$anon$3.apply(package.scala:155)
  at scalaz.package$State$$anon$3.apply(package.scala:154)
  at scalaz.IndexedStateT$class.run(StateT.scala:10)
  at scalaz.package$State$$anon$3.run(package.scala:154)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at scalaz.DisjunctionFunctions$class.fromTryCatchNonFatal(Either.scala:496)
  at scalaz.$bslash$div$.fromTryCatchNonFatal(Either.scala:332)
  at dbus.Marshal$class.unmarshal(Marshal.scala:139)
  at dbus.DBus$.unmarshal(DBus.scala:15)
  at dbus.Marshal$class.unmarshal_(Marshal.scala:145)
  at dbus.DBus$.unmarshal_(DBus.scala:15)
  ... 43 elided

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
java.lang.IllegalArgumentException: UTF-8 cannot decode string from '0x6b39d5016f0000000006be2f61376c566b792f7972757967536c44706736636570616d61477639686d532f626970656570766866397567796a6f41646876766762727a656234397763386d65717261616e6946662f707a796a46753751672f7a7633466e6c33717773656c4a5464776862372f736b74796a75625a656658723173616241'
  at scodec.Attempt$Failure.require(Attempt.scala:122)
  at scodec.Attempt$Failure.require(Attempt.scala:108)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:169)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:168)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:33)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:32)
  at scalaz.Monad$$anonfun$map$1$$anonfun$apply$2.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.point(Id.scala:18)
  at scalaz.Monad$$anonfun$map$1.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.Monad$class.map(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.map(Id.scala:17)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:72)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:71)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.Iterator$class.foreach(Iterator.scala:742)
  at scala.collection.AbstractIterator.foreach(Iterator.scala:1194)
  at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
  at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
  at scala.collection.TraversableOnce$class.foldLeft(TraversableOnce.scala:155)
  at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:71)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:70)
  at scalaz.package$State$$anon$3.apply(package.scala:155)
  at scalaz.package$State$$anon$3.apply(package.scala:154)
  at scalaz.IndexedStateT$class.run(StateT.scala:10)
  at scalaz.package$State$$anon$3.run(package.scala:154)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at scalaz.DisjunctionFunctions$class.fromTryCatchNonFatal(Either.scala:496)
  at scalaz.$bslash$div$.fromTryCatchNonFatal(Either.scala:332)
  at dbus.Marshal$class.unmarshal(Marshal.scala:139)
  at dbus.DBus$.unmarshal(DBus.scala:15)
  at dbus.Marshal$class.unmarshal_(Marshal.scala:145)
  at dbus.DBus$.unmarshal_(DBus.scala:15)
  ... 43 elided

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
java.lang.IllegalArgumentException: cannot acquire 1056 bits from a vector that contains 56 bits
  at scodec.Attempt$Failure.require(Attempt.scala:122)
  at scodec.Attempt$Failure.require(Attempt.scala:108)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:169)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:168)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:33)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:32)
  at scalaz.Monad$$anonfun$map$1$$anonfun$apply$2.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.point(Id.scala:18)
  at scalaz.Monad$$anonfun$map$1.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.Monad$class.map(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.map(Id.scala:17)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:72)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:71)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.Iterator$class.foreach(Iterator.scala:742)
  at scala.collection.AbstractIterator.foreach(Iterator.scala:1194)
  at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
  at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
  at scala.collection.TraversableOnce$class.foldLeft(TraversableOnce.scala:155)
  at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:71)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:70)
  at scalaz.package$State$$anon$3.apply(package.scala:155)
  at scalaz.package$State$$anon$3.apply(package.scala:154)
  at scalaz.IndexedStateT$class.run(StateT.scala:10)
  at scalaz.package$State$$anon$3.run(package.scala:154)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at scalaz.DisjunctionFunctions$class.fromTryCatchNonFatal(Either.scala:496)
  at scalaz.$bslash$div$.fromTryCatchNonFatal(Either.scala:332)
  at dbus.Marshal$class.unmarshal(Marshal.scala:139)
  at dbus.DBus$.unmarshal(DBus.scala:15)
  at dbus.Marshal$class.unmarshal_(Marshal.scala:145)
  at dbus.DBus$.unmarshal_(DBus.scala:15)
  ... 43 elided

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    // FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),
    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvh...
scala> unmarshal_(messageSignature_(m), marshal_(m))
res17: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldObjectPath(ObjectPath(/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyved...
scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    // FieldVariant(FieldInt32(2147483647)),
    // FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    // FieldVariant(FieldInt16(-5409)),
    // FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    // FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),

    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))), FieldVariant(FieldWord8(22)))))

scala> unmarshal_(messageSignature_(m), marshal_(m))
res18: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldVariant(FieldDouble(-2.2349947002630287E-287))))))

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    // FieldVariant(FieldInt32(2147483647)),
    // FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    // FieldVariant(FieldInt16(-5409)),
    // FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    // FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),

    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldObjectPath(ObjectPath(/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efr...
scala> unmarshal_(messageSignature_(m), marshal_(m))
java.lang.IllegalArgumentException: cannot acquire 1056 bits from a vector that contains 56 bits
  at scodec.Attempt$Failure.require(Attempt.scala:122)
  at scodec.Attempt$Failure.require(Attempt.scala:108)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:169)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:168)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:33)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:32)
  at scalaz.Monad$$anonfun$map$1$$anonfun$apply$2.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.point(Id.scala:18)
  at scalaz.Monad$$anonfun$map$1.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.Monad$class.map(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.map(Id.scala:17)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:72)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:71)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.Iterator$class.foreach(Iterator.scala:742)
  at scala.collection.AbstractIterator.foreach(Iterator.scala:1194)
  at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
  at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
  at scala.collection.TraversableOnce$class.foldLeft(TraversableOnce.scala:155)
  at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:71)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:70)
  at scalaz.package$State$$anon$3.apply(package.scala:155)
  at scalaz.package$State$$anon$3.apply(package.scala:154)
  at scalaz.IndexedStateT$class.run(StateT.scala:10)
  at scalaz.package$State$$anon$3.run(package.scala:154)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at scalaz.DisjunctionFunctions$class.fromTryCatchNonFatal(Either.scala:496)
  at scalaz.$bslash$div$.fromTryCatchNonFatal(Either.scala:332)
  at dbus.Marshal$class.unmarshal(Marshal.scala:139)
  at dbus.DBus$.unmarshal(DBus.scala:15)
  at dbus.Marshal$class.unmarshal_(Marshal.scala:145)
  at dbus.DBus$.unmarshal_(DBus.scala:15)
  ... 43 elided

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    // FieldVariant(FieldInt32(2147483647)),
    // FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    // FieldVariant(FieldInt16(-5409)),
    // FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    // FieldVariant(FieldWord16(0)),
    FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),

    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldObjectPath(ObjectPath(/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m))), FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))), FieldVariant(FieldWord8(22)))))

scala> unmarshal_(messageSignature_(m), marshal_(m))
java.lang.IllegalArgumentException: cannot acquire 1056 bits from a vector that contains 56 bits
  at scodec.Attempt$Failure.require(Attempt.scala:122)
  at scodec.Attempt$Failure.require(Attempt.scala:108)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:169)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:168)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:33)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:32)
  at scalaz.Monad$$anonfun$map$1$$anonfun$apply$2.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.point(Id.scala:18)
  at scalaz.Monad$$anonfun$map$1.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.Monad$class.map(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.map(Id.scala:17)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:72)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:71)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.Iterator$class.foreach(Iterator.scala:742)
  at scala.collection.AbstractIterator.foreach(Iterator.scala:1194)
  at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
  at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
  at scala.collection.TraversableOnce$class.foldLeft(TraversableOnce.scala:155)
  at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:71)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:70)
  at scalaz.package$State$$anon$3.apply(package.scala:155)
  at scalaz.package$State$$anon$3.apply(package.scala:154)
  at scalaz.IndexedStateT$class.run(StateT.scala:10)
  at scalaz.package$State$$anon$3.run(package.scala:154)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at scalaz.DisjunctionFunctions$class.fromTryCatchNonFatal(Either.scala:496)
  at scalaz.$bslash$div$.fromTryCatchNonFatal(Either.scala:332)
  at dbus.Marshal$class.unmarshal(Marshal.scala:139)
  at dbus.DBus$.unmarshal(DBus.scala:15)
  at dbus.Marshal$class.unmarshal_(Marshal.scala:145)
  at dbus.DBus$.unmarshal_(DBus.scala:15)
  ... 43 elided

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    // FieldVariant(FieldInt32(2147483647)),
    // FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    // FieldVariant(FieldInt16(-5409)),
    // FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),

    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldWord16(0)), FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))), FieldVariant(FieldWord8(22)))))

scala> unmarshal_(messageSignature_(m), marshal_(m))
java.lang.IllegalArgumentException: cannot acquire 1056 bits from a vector that contains 56 bits
  at scodec.Attempt$Failure.require(Attempt.scala:122)
  at scodec.Attempt$Failure.require(Attempt.scala:108)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:169)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:168)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:33)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:32)
  at scalaz.Monad$$anonfun$map$1$$anonfun$apply$2.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.point(Id.scala:18)
  at scalaz.Monad$$anonfun$map$1.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.Monad$class.map(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.map(Id.scala:17)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:72)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:71)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.Iterator$class.foreach(Iterator.scala:742)
  at scala.collection.AbstractIterator.foreach(Iterator.scala:1194)
  at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
  at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
  at scala.collection.TraversableOnce$class.foldLeft(TraversableOnce.scala:155)
  at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:71)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:70)
  at scalaz.package$State$$anon$3.apply(package.scala:155)
  at scalaz.package$State$$anon$3.apply(package.scala:154)
  at scalaz.IndexedStateT$class.run(StateT.scala:10)
  at scalaz.package$State$$anon$3.run(package.scala:154)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at scalaz.DisjunctionFunctions$class.fromTryCatchNonFatal(Either.scala:496)
  at scalaz.$bslash$div$.fromTryCatchNonFatal(Either.scala:332)
  at dbus.Marshal$class.unmarshal(Marshal.scala:139)
  at dbus.DBus$.unmarshal(DBus.scala:15)
  at dbus.Marshal$class.unmarshal_(Marshal.scala:145)
  at dbus.DBus$.unmarshal_(DBus.scala:15)
  ... 43 elided

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    FieldVariant(FieldInt32(2147483647)),
    // FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    // FieldVariant(FieldInt16(-5409)),
    // FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    // FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),

    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      |      | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))), FieldVariant(FieldWord8(22)))))

scala> unmarshal_(messageSignature_(m), marshal_(m))
res22: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt32(2147483647)), FieldVariant(FieldVariant(FieldDouble(-2.2349947002630287E-287))))))

scala> val m: Vector[Field] = Vector(
  FieldArray(TypeVariant,Vector(
    // FieldVariant(FieldInt32(2147483647)),
    // FieldVariant(FieldObjectPath(ObjectPath("/v/ogotbzuyu0xrpLy0qrbdUheboHpdnsr7upw2gmxo/mbdqcmzzuCImmFsqbapAvz7reh6ritvotWvUhPxo0rcngxNz/avvmaHy/hmkcnonepayTbsqTwwyfeqAtmdaljiPq6zyslqobmpintinMz59uem/o5zr2c0adkmfldzugc7Hdkokxkz9ket4vydc4Uzca0lspwA5eoqowmtjrgg2mnMdif/tophrrnhzsnwczccsnnHfdg0lmn/l2v03ngfjqiZ2yzhct4yxhfsZoExCngwjoq4fco/pmxlfdoSpivmog9itsa1vbe0w9gztu3fvzswbaawRrm/phio7xrdhvsjkbh6klvw/qpxgvkscru98uaUhsowbnimmkvlkvhz5R0ofjXcaqpk9jl0kaxhv/dje/joe8mun1Hcu5exepyvjzpiwywhmyivmzZelwghm61qvuxdf7ddruwe4vG77mmfg1r/lslir8drphwoypd/a1/jyNytw/dx1zjrfiuatQhOafxljC/xoKavbh9rfroXplgbxz3qfhp3zF3qf8pIcpZigtzo/gtzeBfvpdy9HtkzsltehvYnptiy2loaflfaSmnWauhso7r2f6ezuagbsspqr/peuxFrlpaKiWqcdfyvedfqvhvaaw8sdqLc/zrJbbuqpkybbCzrckupjeuzx32a4bputYpdbczCtjD6kiJcApuaGtirijaAQsplJwo/wxjkgghkhfnblzwjotpzwxXtksepF7tr8l8jzpuu3fyyir6dsyogeybp/y0hy/yvmgcje8FvrLbdieq0vde7itjDbekun5oFIOaaynwd9mlpgCrn0paLx/v7yyst4Iqyjvhbrlfpr7nxokkdpgbpmFluvva7wyKa5J/wMrexk7vwgmwpeh1banhzhbpbrwTwo5htduUbuoS3kexyfvzuvz/kipgowb5q/lruxqblywosNTndAdNfNaqpCctfTfpyled2iqjaruopHLsNwkuw0peago6l/lr4pgzcollmwptl8vc6ip96l8gVsf6rxWkOwrhmvzq5wU4etAvxalqdvuwfopn4/iwl1sqcekzzcdjr3ulrgpzO/xUymvl2dfQhTpb6KgwcvqxrsvaseMrqbIwnKgvqpgrns7lx8/fcmkjw8MvnymJrgyhnld8nqsfodcqyckzcwuxaWk7tlcaatdjF4aq/a2egj6yvde2mdvycnxuektQuZxwwiTnfnHdYtkrm/ctfpsuridifheYaa0sfV4qd3ijkKz3unn7duagbuwAa6ardZgmrpepjfcolosbMsv/uvio/zpRpnvtpbHy0nygxglvlgruz4cp6ijdsJt5xehsjlsvWijbqdmes0bhjsfec/pvo/oszvxNvvnbr/nzwmgkwkdbq5klgdckitmtxqb4h25Brkaiptrtmewmhfoe/y289uwvtvpuubqveIyc4zZkVzclnqalqee8ajtwDilh3udvm0pi/eeaBcitzodxdctaatfv7e9qohwMzbanrwsdclvxdvusfzsbcdeytbaGa99cneaebSc/nztbuydd516dcnn8iblg/zhdqqkr8jbijcz4t8werZtx3Pbo8rrikursvnnytzvIk5hwrkgvkevljuneqbzcq8i/nowohbodizt3Qrrzubpspqbi/pknqutyakcewcr9OjguixetaerXllrVtfnuvquwwlprh7rz8NsR/nm7mijiiywdzddbhgYzmcd8W5dcny3zxetrkQW6O/uhujndihtaLcaicpOheepd2zlxpAThqpezgzqkIvmcjhz/mpx/ofmo0tjq92fd22U5bsgga9qdzhuso3b/fbqtdsynlwTvnkfgg0lndmhamqecjqqdw8IkOfucipr3vexkpXue0Badqklao/onjdmsypy/nrwbe9/mxdp5eosfamptiMiCaf5r5e2qgjcflmHptiTkzjnffdkvlndyQyphqjo22/vgthfvdanfpansvsglqjxftcgooysR0jum/gmnzlfdgzbNzrydKdccyqEpmoq/wq3pkchielCaidu5alk6dk9gfuhQ/sbbvyXNbf9xWqlhSmmajqPz6S4csnyU/adnicwIbmsmueigzmncespiDpi/zrvwucxiOlealrvBPojjgdymffl/gwcdevptdj7pkntum0nub4d3psAnibsubkxy"))),
    FieldVariant(FieldInt16(-5409)),
    // FieldVariant(FieldSignature("nxdxsydygoybqobogitguyuqyynobnsxhtquhss".toSignature_)),
    // FieldVariant(FieldWord16(0)),
    // FieldVariant(FieldObjectPath(ObjectPath("/hdynfjphbputnEltOmGkzuZyhKkhfFl5wvzjobix0hxsvaiAyonz/ahlev2rjygn1iywtxbnjw5g9aKfanfp9t5Av87yfpnqifsqemdTankwxBirwtpcEtt/hc9neucfiGdrMlnut2blbhumcg3Iaif3Glstrdvc/tuxgan6xQewy2iwfguFk92iyaom4wjk8QWcukufmoMbVybgu2nmKtnp/odxusdp5xcuoihoef/xss9qgcqvsovo3sn6qsptb/m7e1jokgiXgTwgkzrzyaqwukcgctlJxab0ecyuwwcoooOjxbwbmwzxlSxuvefihytw/i79npltnn4kydzbaTaLnd5Dm7jspb/kohAxxpnyzokikztxVhyCaz5noWbn6Uidwduyal9xgbpjCpmwz/mp/cakeyrfQ0omdqltqngyyhrajqGxGknorpcBcJa2nkipZ5aisxQ/izlj9eunGovigiazlu/ds5ishzjilgmlujiodueFpnjQeivdjzSvzozcwzDttVmdhdh/vuf0dbIy7gkcpsm7gpyPninsod/aczaJwNX0izk/y8ozLm618m"))),
    // FieldVariant(FieldObjectPath(ObjectPath("/crwPTcwridyhuqsippdjwfx1bmEdrvnranmrudvehtbka1sgwj42b/tpww/ynIllyblNsbec/s9pvfnfjmq93uoswl8nca8ghsjAeumFgbDovyu/x1loklW30wek/hlowqpr1kc7xnf2gyE7olj9zc/i/xsofcofyjcvfvjob7eHhfvsllgilzg7mipQ/xT0celri81zahsaypeoc7lcyibewabdtdhaxhr6krbuhGnQw/mfkNioNyv9huy4rdg5remgmgnbVsjxiyKivN7H1fuoyH2y1oHanKgte/l9vrcymant7inrtJwh31/gqf4nqj/gd8rfd9uwgV/hQeulpWpymk8vz4i9s7jeg9ptepfidapsbSkdfgJmlLrddppmih/jmfunxrdps2BuhdjjtuUboxlz3mqsgpjwekadee7dy8ygySgJlqpwhc/ikBajGsiwfduwtmohxywkg/ogdhAyPmzwnoea2Hafhlanh0scdh0oismwlnnn1drbwtDLxdykjVzlqVN2rc9bj0/qa0sib2nsfxwqfqh5uibxahztilckmmryaTsa1sbrwxcglyvxarrenbwjwegaVhEpsz/wdlhuynvq7pympn4Srtsbchmboyocs/ltwfwlEmoPEfza0ijgzkmKdjHQb2sfyxqnyegkwgvLldwzeo/bnyqlmv2efrvghyucGewakpmnoupkffih/svhfmwifsyp8fvfxhzynZtuusp6ujz8omen/uenkgnevsde9Lndq4e1rin2miqxtcPwpGidtRdvYczqujdYvbmgqr1r7r/mfwue3rdfndvglka1n1vTvNsxwwqnxnuyjeoiujdtrhG9shuhwuOcjbmhbbbdrm8k/wyzx3o5RflfrgaL0zUflvaa51ceoz0eslyayrlubmxfxlwtaj/nontyipdnstendrbozLvpEmxMjqzlryZhtuazlfdtjcsp2AyU7oro9oRz/iHwibb/hmczfh/neeTxr9o2e3x0ernysQsxb1exlphxeQluid9odopv/zylbmmtsxpbeqy9Jw7oegvacozdzWoqrequt8jbe/t5bd3nujkvby/l9uemKonhtohvsvt4DuncbdugirTyvxgwmex2oabqixrudbepfFfVtq/lluz6pgikh1ywzwHp8hckjysuzqkgpnimqbUjshcqvlbvYoj6jj/ar3swcmwsqtnz1daJmeDmu5iicd1ffwQbyrefs3823wu8z1aucnscF/lJk9hrsiuafyzkdlwZgBw6jsq/on/ybfwgppdyxhtjuckSiex31jdfqm7J/nzesevnzwlc1itm83BB6wwPsDv0g6aloskdsSywbmwftnuw05mmu2n0mDj/vvNYnM4l/bagxtl1axusMjxfoabbgltkknp9uqmhJ/jfcvmptz8zo0barbgiOlsyjdc7m/gpBywaiunxmbo9jedxaitij/pu57rapsjsxwgvhexj8ettd4YOrshidvp4unemwkn/eclzSvjzurynhjNxisPaPebdld5cUllTlnzyzalnet4rmc9ihgavhkv/yk/nw4cumwsrjepnulhr6ukdV/jmicBBfecDiR7hq1zlzfqq"))),

    FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))),

    // FieldVariant(FieldObjectPath(ObjectPath("/a7lVky/yruygSlDpg6cepamaGv9hmS/bipeepvhf9ugyjoAdhvvgbrzeb49wc8meqraaniFf/pzyjFu7Qg/zv3Fnl3qwselJTdwhb7/sktyjubZefXr1sabAdjj5rYkel0u1ATnjmjufc/d0c53l195gadwyxepnquQmgqoCkfdJycmewhrkkdwfqobmmscr3ihfhaurqxru/wgwQbvtflhhFaivahtlWq5Q/udydvwnr96grg0n96dgilsfys2jbbhrlsbx1hyvdknmCkhJ3pvtZs/ce4Otpl/jqdqI6odwwmemaF7frmuem31qecmrn1vyrokkzoktftmez9/lk3/wfmruwbwleiti6tQjiypvEdympp/qgkjqoatsgoaeNq8tztT4azuio4eYu1zmkj/esCnnubucgjyZdkZ4fjluqnkynprfrhbwbxxbflzrlxdpex/ev/uttqX7pG1gfX38Pikkfj/hnjuxuXlwbrvoauugecdtjljfpeqcmvgmwt2tc/prbplbmnpbzrdqsaIk22a8jsepgmgh3if3lwledquqcsfvaqe1/hulmtvidmzdyElAvF7jeePmpl7x4pywypachnxmrvweiaeym1crfjgjdh/nTkax4lszoj6ckgjqW7qw5qwdjkmfrpuysmptegzfq3fMkhYkvFhktscmluix/aqs3aozcJxgDw0m3/ySs9tuywtz4pwrn9xdnebuk6rbi6tnZvl9xxmmziormFyVsfuowln6/wgiextwZjvlz2cnogv7fmzpwkgazo7vyhxnaxhvhmtm9awz6nt1ruApoqt/ai9mrkrlvelbpjjwaec/kqbQojkb7rLgszeujsb8v/tke0qccaK/e9z/zeefqgwunkrghFpqdym/h64ZidGudr3hpDWrLbnotkmepc9Tysxq5qSh4sz/hf5wpytshz4odhPenqe2bgifn2e3cIrxfvLdbw9cievoxqnl2/lDvQzofPklwDn9jTspgjy1FQuWqpy0vtkcpAIzfr/guvf7yaTcizdQudqumolegrpouuevZrkviqG7reynefkv67fsxrw2slpxi/jqjaor5dtRnvnel6sshexqdaowOhffVqq90xgqkCLsly8sjor8tn5ypwunrieuHo/u9nflin97coi/il/xwbprk3aRb0ghBw4AnAj/mmhqdiwyinuA/lzquxyrcvllpas8qchuK5mCmjdnN2y9sehCrYvzIvpxsi/oExXeeuujzxli4qThkyt95lprPxlvzntvTzozmAi373Elhpzvahssjrm/dGdux3Vlmyjwayz6kk3ibO7zm/ovsmipmydVqjvuxcgpl5udwaemnzauRmutwrkyrbtRfyzfyOb2pvlw/dpTnj2tbLszhurUtimwaqxbbkhsgbx10flsy/tJS4hgQQSfosoiwnsP/zl0672dwzovs51pnqt95bpjtngv1l49rW0y2rXqqrxee/fhvpfzpiDqfnorzyoxqm0fhoMFs0KqqcmnlyvsiCa/exyj8yF353eIj9t5pqfo5fAnsoenFejgq/jXkgvq9n4vPgevi8iH4ijztvgWg1q/lTiIOkgnwfzZsTmxyzmmpcgtuexrotIgylvtd/bt6rrxmeuyomokvwMtnHm31zd7gxp9zW0ypjzwdeybedtaurjhnylyfxh3oepc/yqnyyktbdxagnsqxgfnnibk6x1edeaor"))),
    // FieldVariant(FieldString("忰훪孰䢈㯣琸퉒쑭爗墂")),
    // FieldVariant(FieldUnixFD(-1702340653)),
    // FieldVariant(FieldUnixFD(-1)),

    // FieldVariant(FieldString("㱏賐잯塚玀걐唥쌖㲼鄿ꞧ휖Ἵ噌궊繶鏫뎚콉҂驘嶯躀俽")),
    // FieldVariant(FieldDouble(-3.4470417411321385E-4)),
    // FieldVariant(FieldInt16(0)),
    // FieldVariant(FieldString("秪ࡷଏﾞꔡល혚ৄ墨☨奰栝Ꝭᱭ襮톢붒ꂶ嗼떸糯询薐榩睋㱇罏듚ቔ돾鮴䥸뎌彘঻")),
    // FieldVariant(FieldWord16(32767)),
    FieldVariant(FieldWord8(22))))
)
     | m: Vector[dbus.DBus.Field] = Vector(FieldArray(TypeVariant,Vector(FieldVariant(FieldInt16(-5409)), FieldVariant(FieldVariant(FieldDouble(-1.861118585304414E287))), FieldVariant(FieldWord8(22)))))

scala> unmarshal_(messageSignature_(m), marshal_(m))
java.lang.IllegalArgumentException: cannot acquire 1056 bits from a vector that contains 56 bits
  at scodec.Attempt$Failure.require(Attempt.scala:122)
  at scodec.Attempt$Failure.require(Attempt.scala:108)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$decodeField$13.apply(Marshal.scala:189)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:169)
  at dbus.Marshal$$anonfun$updateUnmarshalState$1$1.apply(Marshal.scala:168)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:33)
  at scalaz.IndexedStateT$$anonfun$map$1$$anonfun$apply$1.apply(StateT.scala:32)
  at scalaz.Monad$$anonfun$map$1$$anonfun$apply$2.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.point(Id.scala:18)
  at scalaz.Monad$$anonfun$map$1.apply(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.Monad$class.map(Monad.scala:14)
  at scalaz.IdInstances$$anon$1.map(Id.scala:17)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$map$1.apply(StateT.scala:32)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:63)
  at scalaz.IndexedStateT$$anonfun$flatMap$1$$anonfun$apply$5.apply(StateT.scala:62)
  at scalaz.IdInstances$$anon$1.bind(Id.scala:20)
  at scalaz.IndexedStateT$$anonfun$flatMap$1.apply(StateT.scala:62)
  at scalaz.IndexedStateT$$anon$11.apply(StateT.scala:95)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:72)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1$$anonfun$apply$4.apply(IndexedSeq.scala:71)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.TraversableOnce$$anonfun$foldLeft$1.apply(TraversableOnce.scala:155)
  at scala.collection.Iterator$class.foreach(Iterator.scala:742)
  at scala.collection.AbstractIterator.foreach(Iterator.scala:1194)
  at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
  at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
  at scala.collection.TraversableOnce$class.foldLeft(TraversableOnce.scala:155)
  at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:71)
  at scalaz.std.IndexedSeqSubInstances$$anon$1$$anonfun$traverseS$1.apply(IndexedSeq.scala:70)
  at scalaz.package$State$$anon$3.apply(package.scala:155)
  at scalaz.package$State$$anon$3.apply(package.scala:154)
  at scalaz.IndexedStateT$class.run(StateT.scala:10)
  at scalaz.package$State$$anon$3.run(package.scala:154)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at dbus.Marshal$$anonfun$unmarshal$1.apply(Marshal.scala:139)
  at scalaz.DisjunctionFunctions$class.fromTryCatchNonFatal(Either.scala:496)
  at scalaz.$bslash$div$.fromTryCatchNonFatal(Either.scala:332)
  at dbus.Marshal$class.unmarshal(Marshal.scala:139)
  at dbus.DBus$.unmarshal(DBus.scala:15)
  at dbus.Marshal$class.unmarshal_(Marshal.scala:145)
  at dbus.DBus$.unmarshal_(DBus.scala:15)
  ... 43 elided

scala> 