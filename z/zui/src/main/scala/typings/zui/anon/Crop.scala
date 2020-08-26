package typings.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crop extends js.Object {
  var crop: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var preserve_headers: js.UndefOr[Boolean] = js.native
  var quuality: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Crop {
  @scala.inline
  def apply(): Crop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crop]
  }
  @scala.inline
  implicit class CropOps[Self <: Crop] (val x: Self) extends AnyVal {
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
    def setCrop(value: Boolean): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPreserve_headers(value: Boolean): Self = this.set("preserve_headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserve_headers: Self = this.set("preserve_headers", js.undefined)
    @scala.inline
    def setQuuality(value: Double): Self = this.set("quuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuuality: Self = this.set("quuality", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

