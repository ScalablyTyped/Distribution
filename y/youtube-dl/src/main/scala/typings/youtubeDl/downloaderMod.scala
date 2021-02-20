package typings.youtubeDl

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloaderMod {
  
  @JSImport("youtube-dl/lib/downloader", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[String] = js.native
  @JSImport("youtube-dl/lib/downloader", JSImport.Namespace)
  @js.native
  def apply(binDir: String): js.Promise[String] = js.native
  /**
    * Place the `youtube-dl` binary in a specific directory and control when it gets updates.
    */
  @JSImport("youtube-dl/lib/downloader", JSImport.Namespace)
  @js.native
  def apply(
    binDir: String,
    callback: js.Function2[/* err */ Error | String | Null, /* message */ js.UndefOr[String], Unit]
  ): Unit = js.native
  @JSImport("youtube-dl/lib/downloader", JSImport.Namespace)
  @js.native
  def apply(
    binDir: Null,
    callback: js.Function2[/* err */ Error | String | Null, /* message */ js.UndefOr[String], Unit]
  ): Unit = js.native
  @JSImport("youtube-dl/lib/downloader", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function2[/* err */ Error | String | Null, /* message */ js.UndefOr[String], Unit]): Unit = js.native
}
