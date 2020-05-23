package typings.yup.mod

import typings.std.Record
import typings.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusiveTestOptions[P /* <: Record[String, _] */]
  extends BaseTestOptions[P]
     with TestOptions[P] {
  @JSName("exclusive")
  var exclusive_ExclusiveTestOptions: `true` = js.native
  @JSName("name")
  var name_ExclusiveTestOptions: String = js.native
}

