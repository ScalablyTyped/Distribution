package typings
package yog2DashKernelLib.yog2DashKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog2-kernel", "yog")
@js.native
object yogNs extends js.Object {
  @js.native
  class Yog () extends js.Object {
    var RAL: yog2DashKernelLib.Anon_GetConf = js.native
    var ROOT_PATH: java.lang.String = js.native
    var `_`: js.Any = js.native
    var app: expressLib.expressMod.eNs.Express = js.native
    var express: js.Any = js.native
    var log: yogDashLogLib.yogDashLogMod.Logger = js.native
    // 当 yog.conf.promise.overrideRAL 为true时，可以当作promise使用
    var ral: yog2DashKernelLib.Anon_GetConf | js.Object = js.native
    // debug模式时存在
    var reloadApp: js.UndefOr[js.Function1[/* appName */ java.lang.String, scala.Unit]] = js.native
    // debug模式时存在
    var reloadIsomorphic: js.UndefOr[js.Function0[scala.Unit]] = js.native
    // debug模式时存在
    var reloadView: js.UndefOr[js.Function0[scala.Unit]] = js.native
    var view: yog2DashKernelLib.Anon_CleanCache = js.native
    def bootstrap(option: yog2DashKernelLib.yog2DashKernelMod.YogBootstrapOption): scala.Unit = js.native
    def bootstrap(option: yog2DashKernelLib.yog2DashKernelMod.YogBootstrapOption, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  }
  
}

