package typings.youtubeDl

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloaderMod {
  
  inline def apply(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String]]
  inline def apply(binDir: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(binDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  /**
    * Place the `youtube-dl` binary in a specific directory and control when it gets updates.
    */
  inline def apply(
    binDir: String,
    callback: js.Function2[/* err */ Error | String | Null, /* message */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(binDir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    binDir: Null,
    callback: js.Function2[/* err */ Error | String | Null, /* message */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(binDir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(callback: js.Function2[/* err */ Error | String | Null, /* message */ js.UndefOr[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("youtube-dl/lib/downloader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
