package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientHelper extends js.Object {
  @JSName("authentication")
  var authentication_Original: AuthenticationCallback = js.native
  var servers: js.Promise[js.Array[String]] = js.native
  def authentication(): AbstractHandshake = js.native
  def getUniqRequestId(): String = js.native
}

