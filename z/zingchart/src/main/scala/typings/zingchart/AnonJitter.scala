package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJitter extends js.Object {
  /**
    * To set the jitter width. 0 | .5 | 1 | 2 | ...
    */
  var jitter: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the `mean-factor` width. 0 | .5 | 1 | 2 | ...
    */
  var meanFactor: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the `rounding-factor` on median edges. 0 | .5 | 1 | 2 | ...
    */
  var roundingFactor: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the styling of the violin object. {}
    */
  var style: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the trim. true | false | 0 | 1
    */
  var trim: js.UndefOr[Boolean] = js.undefined
}

object AnonJitter {
  @scala.inline
  def apply(
    jitter: js.Any = null,
    meanFactor: js.Any = null,
    roundingFactor: js.Any = null,
    style: js.Any = null,
    trim: js.UndefOr[Boolean] = js.undefined
  ): AnonJitter = {
    val __obj = js.Dynamic.literal()
    if (jitter != null) __obj.updateDynamic("jitter")(jitter.asInstanceOf[js.Any])
    if (meanFactor != null) __obj.updateDynamic("meanFactor")(meanFactor.asInstanceOf[js.Any])
    if (roundingFactor != null) __obj.updateDynamic("roundingFactor")(roundingFactor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJitter]
  }
}

