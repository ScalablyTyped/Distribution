package typings.yog2Kernel.mod

import typings.express.mod.Express
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YogBootstrapOption extends js.Object {
  // 设置app，未设置则直接使用express
  var app: js.UndefOr[Express] = js.native
  // 设置conf目录
  var confPath: js.UndefOr[String] = js.native
  // 设置plugins目录
  var pluginsPath: js.UndefOr[String] = js.native
  // 设置yog根目录，默认使用启动文件的目录
  var rootPath: js.UndefOr[String] = js.native
}

object YogBootstrapOption {
  @scala.inline
  def apply(): YogBootstrapOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YogBootstrapOption]
  }
  @scala.inline
  implicit class YogBootstrapOptionOps[Self <: YogBootstrapOption] (val x: Self) extends AnyVal {
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
    def setApp(value: Express): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setConfPath(value: String): Self = this.set("confPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfPath: Self = this.set("confPath", js.undefined)
    @scala.inline
    def setPluginsPath(value: String): Self = this.set("pluginsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginsPath: Self = this.set("pluginsPath", js.undefined)
    @scala.inline
    def setRootPath(value: String): Self = this.set("rootPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPath: Self = this.set("rootPath", js.undefined)
  }
  
}

