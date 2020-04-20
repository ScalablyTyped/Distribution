package typings.yog2Kernel.mod

import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.IRouter
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends IRouter {
  def action(actionName: String): (RequestHandler[ParamsDictionary, _, _, Query]) | ActionObject = js.native
  def wrapAsync(fn: js.Function3[/* req */ Request, /* resp */ Response, /* next */ NextFunction, _]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

