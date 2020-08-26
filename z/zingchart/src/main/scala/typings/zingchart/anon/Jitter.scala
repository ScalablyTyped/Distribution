package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jitter extends js.Object {
  /**
    * To set the jitter width. 0 | .5 | 1 | 2 | ...
    */
  var jitter: js.UndefOr[js.Any] = js.native
  /**
    * To set the `mean-factor` width. 0 | .5 | 1 | 2 | ...
    */
  var meanFactor: js.UndefOr[js.Any] = js.native
  /**
    * To set the `rounding-factor` on median edges. 0 | .5 | 1 | 2 | ...
    */
  var roundingFactor: js.UndefOr[js.Any] = js.native
  /**
    * To set the styling of the violin object. {}
    */
  var style: js.UndefOr[js.Any] = js.native
  /**
    * To set the trim. true | false | 0 | 1
    */
  var trim: js.UndefOr[Boolean] = js.native
}

object Jitter {
  @scala.inline
  def apply(): Jitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jitter]
  }
  @scala.inline
  implicit class JitterOps[Self <: Jitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJitter(value: js.Any): Self = this.set("jitter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJitter: Self = this.set("jitter", js.undefined)
    @scala.inline
    def setMeanFactor(value: js.Any): Self = this.set("meanFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeanFactor: Self = this.set("meanFactor", js.undefined)
    @scala.inline
    def setRoundingFactor(value: js.Any): Self = this.set("roundingFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundingFactor: Self = this.set("roundingFactor", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}

