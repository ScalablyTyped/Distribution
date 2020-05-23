package typings.yup.mod

import typings.std.Record
import typings.yup.yupBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonExclusiveTestOptions[P /* <: Record[String, _] */]
  extends BaseTestOptions[P]
     with TestOptions[P] {
  @JSName("exclusive")
  var exclusive_NonExclusiveTestOptions: js.UndefOr[`false`] = js.native
}

