package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle[InputData] extends js.Object {
  var authData: AuthData
  var inputData: InputData
}

object Bundle {
  @scala.inline
  def apply[InputData](authData: AuthData, inputData: InputData): Bundle[InputData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authData")(authData)
    __obj.updateDynamic("inputData")(inputData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[InputData]]
  }
}

