package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zapier-platform-core", JSImport.Namespace)
@js.native
object zapierDashPlatformDashCoreModMembers extends js.Object {
  val version: java.lang.String = js.native
  def createAppHandler(appRawOrPath: java.lang.String): js.Function3[/* event */ js.Any, /* context */ js.Any, /* callback */ js.Any, scala.Unit] = js.native
  def createAppHandler(appRawOrPath: js.Object): js.Function3[/* event */ js.Any, /* context */ js.Any, /* callback */ js.Any, scala.Unit] = js.native
  def createAppTester(appRawOrPath: java.lang.String): js.Promise[_] = js.native
  def createAppTester(appRawOrPath: js.Object): js.Promise[_] = js.native
  def integrationTestHandler(event: js.Any, context: js.Any, callback: js.Any): js.Any = js.native
}

