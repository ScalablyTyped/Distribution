package typings
package yog2DashKernelLib.yog2DashKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Yog extends js.Object {
  @JSName("RAL")
  var RAL_Original: yog2DashKernelLib.Anon_AppendExtPath = js.native
  var ROOT_PATH: java.lang.String = js.native
  var `_`: lodashLib.lodashMod.LoDashStatic = js.native
  @JSName("app")
  var app_Original: expressLib.expressMod.Express = js.native
  @JSName("express")
  var express_Original: (js.Function0[
    expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Express
  ]) with yog2DashKernelLib.Anon_Application = js.native
  var log: yogDashLogLib.yogDashLogMod.Logger = js.native
  // 当 yog.conf.promise.overrideRAL 为true时，可以当作promise使用
  var ral: yog2DashKernelLib.Anon_AppendExtPath | yog2DashKernelLib.Anon_Name = js.native
  @JSName("ralP")
  var ralP_Original: yog2DashKernelLib.Anon_Name = js.native
  // debug模式时存在
  var reloadApp: js.UndefOr[js.Function1[/* appName */ java.lang.String, scala.Unit]] = js.native
  // debug模式时存在
  var reloadIsomorphic: js.UndefOr[js.Function0[scala.Unit]] = js.native
  // debug模式时存在
  var reloadView: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var view: yog2DashKernelLib.Anon_CleanCache = js.native
  def RAL(serviceName: java.lang.String): nodeDashRalLib.nodeDashRalMod.RALNs.RalRunner = js.native
  def RAL(serviceName: java.lang.String, options: js.Object): nodeDashRalLib.nodeDashRalMod.RALNs.RalRunner = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: nodeLib.httpMod.ServerResponse
  ): js.Any = js.native
  def app(
    req: nodeLib.httpMod.IncomingMessage,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
  def bootstrap(option: YogBootstrapOption): scala.Unit = js.native
  def bootstrap(option: YogBootstrapOption, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def express(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Express = js.native
  def ralP[T](name: java.lang.String): js.Promise[T] = js.native
  def ralP[T](name: java.lang.String, options: js.Object): js.Promise[T] = js.native
}

