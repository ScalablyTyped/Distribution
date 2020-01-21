package typings.zxcvbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zxcvbn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(password: String): ZXCVBNResult = js.native
  def apply(password: String, userInputs: js.Array[String]): ZXCVBNResult = js.native
}

