package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshAccessTokenBundle[InputData] extends js.Object {
  var authData: AuthData
  var inputData: InputData
}

object RefreshAccessTokenBundle {
  @scala.inline
  def apply[InputData](authData: AuthData, inputData: InputData): RefreshAccessTokenBundle[InputData] = {
    val __obj = js.Dynamic.literal(authData = authData, inputData = inputData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RefreshAccessTokenBundle[InputData]]
  }
}

