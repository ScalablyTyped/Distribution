package typings.yog2Kernel.mod

import typings.express.mod.Express
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YogBootstrapOption extends js.Object {
  // 设置app，未设置则直接使用express
  var app: js.UndefOr[Express] = js.undefined
  // 设置conf目录
  var confPath: js.UndefOr[String] = js.undefined
  // 设置plugins目录
  var pluginsPath: js.UndefOr[String] = js.undefined
  // 设置yog根目录，默认使用启动文件的目录
  var rootPath: js.UndefOr[String] = js.undefined
}

object YogBootstrapOption {
  @scala.inline
  def apply(app: Express = null, confPath: String = null, pluginsPath: String = null, rootPath: String = null): YogBootstrapOption = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (confPath != null) __obj.updateDynamic("confPath")(confPath.asInstanceOf[js.Any])
    if (pluginsPath != null) __obj.updateDynamic("pluginsPath")(pluginsPath.asInstanceOf[js.Any])
    if (rootPath != null) __obj.updateDynamic("rootPath")(rootPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[YogBootstrapOption]
  }
}

