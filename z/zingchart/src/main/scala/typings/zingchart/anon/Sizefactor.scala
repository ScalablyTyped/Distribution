package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sizefactor extends js.Object {
  /**
    * To modify the size of the chart. Provide a value in relation to 1.0 or 100%. 0.3 | 0.9 | "30%" | "90%" | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.undefined
}

object Sizefactor {
  @scala.inline
  def apply(`size-factor`: js.UndefOr[Double] = js.undefined): Sizefactor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`size-factor`)) __obj.updateDynamic("size-factor")(`size-factor`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sizefactor]
  }
}

