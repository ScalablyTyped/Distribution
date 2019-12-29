package typings.yup.yupMod

import typings.yup.Anon_ContextPrefix
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yup", "Ref")
@js.native
class Ref protected () extends js.Object {
  val __isYupRef: `true` = js.native
}

@JSImport("yup", "ref")
@js.native
object ref extends js.Object {
  def apply(path: String): Ref = js.native
  def apply(path: String, options: Anon_ContextPrefix): Ref = js.native
}

