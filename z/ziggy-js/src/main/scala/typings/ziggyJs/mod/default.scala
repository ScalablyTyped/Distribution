package typings.ziggyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ziggy-js", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(name: String): Router = js.native
  def apply(
    name: String,
    params: js.UndefOr[InputParams],
    absolute: js.UndefOr[scala.Nothing],
    customZiggy: Config
  ): Router = js.native
  def apply(name: String, params: js.UndefOr[InputParams], absolute: Boolean): Router = js.native
  def apply(name: String, params: js.UndefOr[InputParams], absolute: Boolean, customZiggy: Config): Router = js.native
  def apply(name: String, params: InputParams): Router = js.native
}
