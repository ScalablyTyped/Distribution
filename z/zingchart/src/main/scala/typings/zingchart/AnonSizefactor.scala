package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSizefactor extends js.Object {
  /**
    * To modify the size of the chart. Provide a value in relation to 1.0 or 100%. 0.3 | 0.9 | "30%" | "90%" | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.undefined
}

object AnonSizefactor {
  @scala.inline
  def apply(`size-factor`: Int | Double = null): AnonSizefactor = {
    val __obj = js.Dynamic.literal()
    if (`size-factor` != null) __obj.updateDynamic("size-factor")(`size-factor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizefactor]
  }
}

