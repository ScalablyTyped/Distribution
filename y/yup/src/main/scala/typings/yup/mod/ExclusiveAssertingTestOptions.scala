package typings.yup.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusiveAssertingTestOptions[U, P /* <: Record[String, _] */]
  extends ExclusiveTestOptions[P]
     with AssertingTestOptions[U, P] {
  @JSName("test")
  var test_Original_ExclusiveAssertingTestOptions: AssertingTestFunction[U] = js.native
}

