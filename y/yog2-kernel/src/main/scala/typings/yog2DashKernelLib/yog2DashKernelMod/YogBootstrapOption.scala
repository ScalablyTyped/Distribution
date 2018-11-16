package typings
package yog2DashKernelLib.yog2DashKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait YogBootstrapOption extends js.Object {
  // 设置app，未设置则直接使用express
  var app: js.UndefOr[expressLib.expressMod.eNs.Express] = js.undefined
  // 设置conf目录
  var confPath: js.UndefOr[java.lang.String] = js.undefined
  // 设置plugins目录
  var pluginsPath: js.UndefOr[java.lang.String] = js.undefined
  // 设置yog根目录，默认使用启动文件的目录
  var rootPath: js.UndefOr[java.lang.String] = js.undefined
}

