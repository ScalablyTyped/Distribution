package typings.youtubePlayer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var list: js.UndefOr[String] = js.native
  var listType: String = js.native
  var startSeconds: js.UndefOr[Double] = js.native
  var suggestedQuality: js.UndefOr[String] = js.native
}

object Index {
  @scala.inline
  def apply(listType: String): Index = {
    val __obj = js.Dynamic.literal(listType = listType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
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
    def setListType(value: String): Self = this.set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setStartSeconds(value: Double): Self = this.set("startSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartSeconds: Self = this.set("startSeconds", js.undefined)
    @scala.inline
    def setSuggestedQuality(value: String): Self = this.set("suggestedQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedQuality: Self = this.set("suggestedQuality", js.undefined)
  }
  
}

