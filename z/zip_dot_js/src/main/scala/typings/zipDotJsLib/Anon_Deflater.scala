package typings
package zipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deflater extends js.Object {
  var deflater: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var inflater: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Deflater {
  @scala.inline
  def apply(deflater: js.Array[java.lang.String] = null, inflater: js.Array[java.lang.String] = null): Anon_Deflater = {
    val __obj = js.Dynamic.literal()
    if (deflater != null) __obj.updateDynamic("deflater")(deflater)
    if (inflater != null) __obj.updateDynamic("inflater")(inflater)
    __obj.asInstanceOf[Anon_Deflater]
  }
}

