package typings
package yog2DashKernelLib.yog2DashKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YogBootstrapOption extends js.Object {
  // 设置app，未设置则直接使用express
  var app: js.UndefOr[expressLib.expressMod.Express] = js.undefined
  // 设置conf目录
  var confPath: js.UndefOr[java.lang.String] = js.undefined
  // 设置plugins目录
  var pluginsPath: js.UndefOr[java.lang.String] = js.undefined
  // 设置yog根目录，默认使用启动文件的目录
  var rootPath: js.UndefOr[java.lang.String] = js.undefined
}

object YogBootstrapOption {
  @scala.inline
  def apply(
    app: expressLib.expressMod.Express = null,
    confPath: java.lang.String = null,
    pluginsPath: java.lang.String = null,
    rootPath: java.lang.String = null
  ): YogBootstrapOption = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app)
    if (confPath != null) __obj.updateDynamic("confPath")(confPath)
    if (pluginsPath != null) __obj.updateDynamic("pluginsPath")(pluginsPath)
    if (rootPath != null) __obj.updateDynamic("rootPath")(rootPath)
    __obj.asInstanceOf[YogBootstrapOption]
  }
}

