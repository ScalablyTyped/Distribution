package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions extends js.Object {
  /**
    * The category (for example `'music'`.)
    * @default ''
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The location.
    * @default 'US'
    */
  var gl: js.UndefOr[String] = js.native
  /**
    * The language.
    * @default 'en'
    */
  var hl: js.UndefOr[String] = js.native
  var pageEnd: js.UndefOr[Double] = js.native
  var pageStart: js.UndefOr[Double] = js.native
  var pages: js.UndefOr[Double] = js.native
  var sp: js.UndefOr[String] = js.native
  var userAgent: js.UndefOr[String] = js.native
}

object BaseOptions {
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setGl(value: String): Self = this.set("gl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGl: Self = this.set("gl", js.undefined)
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    @scala.inline
    def setPageEnd(value: Double): Self = this.set("pageEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageEnd: Self = this.set("pageEnd", js.undefined)
    @scala.inline
    def setPageStart(value: Double): Self = this.set("pageStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageStart: Self = this.set("pageStart", js.undefined)
    @scala.inline
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setSp(value: String): Self = this.set("sp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSp: Self = this.set("sp", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
  
}

