package typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.zapierDashPlatformDashCore.Anon_CustomStoreKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zapier-platform-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def createAppTester(appRaw: js.Object): js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[StringDictionary[_]], js.Promise[_]], 
    /* bundle */ js.UndefOr[Partial[Bundle[StringDictionary[_]]]], 
    js.Promise[_]
  ] = js.native
  def createAppTester(appRaw: js.Object, options: Anon_CustomStoreKey): js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[StringDictionary[_]], js.Promise[_]], 
    /* bundle */ js.UndefOr[Partial[Bundle[StringDictionary[_]]]], 
    js.Promise[_]
  ] = js.native
}

