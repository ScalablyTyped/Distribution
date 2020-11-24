package typings.youtubeDl.mod

import typings.node.streamMod.Readable
import typings.youtubeDl.youtubeDlStrings.complete
import typings.youtubeDl.youtubeDlStrings.error
import typings.youtubeDl.youtubeDlStrings.info
import typings.youtubeDl.youtubeDlStrings.next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Youtubedl extends Readable {
  
  @JSName("on")
  def on_complete(event: complete, listener: js.Function1[/* info */ Info, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_info(event: info, listener: js.Function1[/* info */ Info, Unit]): this.type = js.native
  @JSName("on")
  def on_next(event: next, listener: js.Function1[/* data */ Info | js.Array[Info], Unit]): this.type = js.native
}
