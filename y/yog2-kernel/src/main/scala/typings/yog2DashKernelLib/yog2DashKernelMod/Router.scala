package typings
package yog2DashKernelLib.yog2DashKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router
  extends expressLib.expressMod.eNs.Router {
  def action(actionName: java.lang.String): expressLib.expressMod.eNs.RequestHandler | ActionObject = js.native
  def wrapAsync(
    fn: js.Function3[
      /* req */ Request, 
      /* resp */ Response, 
      /* next */ expressLib.expressMod.eNs.NextFunction, 
      _
    ]
  ): expressLib.expressMod.eNs.RequestHandler = js.native
}

