package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoundedRectOptions extends ShapeOptions {
  /** @default 0.25 */
  val cornerRadius: js.UndefOr[Double] = js.native
  /** @default 1 */
  val height: js.UndefOr[Double] = js.native
  /** @default 1 */
  val width: js.UndefOr[Double] = js.native
}

object RoundedRectOptions {
  @scala.inline
  def apply(): RoundedRectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoundedRectOptions]
  }
  @scala.inline
  implicit class RoundedRectOptionsOps[Self <: RoundedRectOptions] (val x: Self) extends AnyVal {
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
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

