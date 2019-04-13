package typings
package yog2DashKernelLib.yog2DashKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.IRouter {
  def action(actionName: java.lang.String): expressLib.expressMod.RequestHandler | ActionObject = js.native
  def wrapAsync(
    fn: js.Function3[
      /* req */ Request, 
      /* resp */ Response, 
      /* next */ expressLib.expressMod.NextFunction, 
      _
    ]
  ): expressLib.expressMod.RequestHandler = js.native
}

