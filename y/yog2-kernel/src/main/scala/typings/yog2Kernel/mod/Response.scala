package typings.yog2Kernel.mod

import typings.yogBigpipe.mod.BigPipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response
  extends typings.expressServeStaticCore.mod.Response[js.Any, Double] {
  
  var bigpipe: BigPipe = js.native
}
