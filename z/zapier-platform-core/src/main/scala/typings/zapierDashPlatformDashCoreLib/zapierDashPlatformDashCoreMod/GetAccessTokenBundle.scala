package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessTokenBundle[InputData] extends js.Object {
  var inputData: InputData with zapierDashPlatformDashCoreLib.Anon_Code
}

object GetAccessTokenBundle {
  @scala.inline
  def apply[InputData](inputData: InputData with zapierDashPlatformDashCoreLib.Anon_Code): GetAccessTokenBundle[InputData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inputData")(inputData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessTokenBundle[InputData]]
  }
}

