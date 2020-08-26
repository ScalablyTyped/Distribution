package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * image cutter
  */
@js.native
trait ImageCutterOption extends js.Object {
  var coverColor: js.UndefOr[String] = js.native
  var coverOpacity: js.UndefOr[Double] = js.native
  var defaultHeight: js.UndefOr[Double] = js.native
  var defaultWidth: js.UndefOr[Double] = js.native
  var fixedRatio: js.UndefOr[Boolean] = js.native
  var get: js.UndefOr[String] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var post: js.UndefOr[String] = js.native
}

object ImageCutterOption {
  @scala.inline
  def apply(): ImageCutterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageCutterOption]
  }
  @scala.inline
  implicit class ImageCutterOptionOps[Self <: ImageCutterOption] (val x: Self) extends AnyVal {
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
    def setCoverColor(value: String): Self = this.set("coverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverColor: Self = this.set("coverColor", js.undefined)
    @scala.inline
    def setCoverOpacity(value: Double): Self = this.set("coverOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverOpacity: Self = this.set("coverOpacity", js.undefined)
    @scala.inline
    def setDefaultHeight(value: Double): Self = this.set("defaultHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHeight: Self = this.set("defaultHeight", js.undefined)
    @scala.inline
    def setDefaultWidth(value: Double): Self = this.set("defaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWidth: Self = this.set("defaultWidth", js.undefined)
    @scala.inline
    def setFixedRatio(value: Boolean): Self = this.set("fixedRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedRatio: Self = this.set("fixedRatio", js.undefined)
    @scala.inline
    def setGet(value: String): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setPost(value: String): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
  }
  
}

