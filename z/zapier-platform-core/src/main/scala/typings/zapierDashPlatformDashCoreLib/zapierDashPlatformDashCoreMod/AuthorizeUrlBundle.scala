package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeUrlBundle[InputData] extends js.Object {
  var inputData: InputData
}

object AuthorizeUrlBundle {
  @scala.inline
  def apply[InputData](inputData: InputData): AuthorizeUrlBundle[InputData] = {
    val __obj = js.Dynamic.literal(inputData = inputData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthorizeUrlBundle[InputData]]
  }
}

