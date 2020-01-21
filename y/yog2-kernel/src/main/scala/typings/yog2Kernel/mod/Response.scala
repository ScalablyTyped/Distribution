package typings.yog2Kernel.mod

import typings.yogBigpipe.mod.BigPipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends typings.expressServeStaticCore.mod.Response[js.Any] {
  var bigpipe: BigPipe = js.native
}

