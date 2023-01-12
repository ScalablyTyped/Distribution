package typings.youtubeDl

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import typings.youtubeDl.youtubeDlStrings.complete
import typings.youtubeDl.youtubeDlStrings.error
import typings.youtubeDl.youtubeDlStrings.info
import typings.youtubeDl.youtubeDlStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String, arg: js.Array[String], opt: StringDictionary[String]): Youtubedl = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Youtubedl]
  
  @JSImport("youtube-dl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Call `youtube-dl` with whatever arguments you like.
    */
  inline def exec(
    url: String,
    args: js.Array[String],
    options: Options,
    callback: js.Function2[/* err */ Any, /* output */ js.Array[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getExtractors(callback: js.Function2[/* err */ Any, /* output */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtractors")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getExtractors(descriptions: Boolean, callback: js.Function2[/* err */ Any, /* output */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtractors")(descriptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getExtractors(
    descriptions: Boolean,
    options: Options,
    callback: js.Function2[/* err */ Any, /* output */ js.Array[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtractors")(descriptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getInfo(
    url: String,
    args: js.Array[String],
    callback: js.Function2[/* err */ Any, /* output */ Info, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getInfo(
    url: String,
    args: js.Array[String],
    options: Options,
    callback: js.Function2[/* err */ Any, /* output */ Info, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getInfo(url: String, callback: js.Function2[/* err */ Any, /* output */ Info, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSubs(url: String, callback: js.Function2[/* err */ Any, /* output */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubs")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getSubs(
    url: String,
    options: Options,
    callback: js.Function2[/* err */ Any, /* output */ js.Array[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubs")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getThumbs(url: String, callback: js.Function2[/* err */ Any, /* output */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getThumbs")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getThumbs(
    url: String,
    options: Options,
    callback: js.Function2[/* err */ Any, /* output */ js.Array[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getThumbs")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Info extends StObject {
    
    var _duration_hms: String
    
    var _duration_raw: Double
    
    var _filename: String
    
    var duration: String
    
    var filename: String
    
    var size: Double
  }
  object Info {
    
    inline def apply(
      _duration_hms: String,
      _duration_raw: Double,
      _filename: String,
      duration: String,
      filename: String,
      size: Double
    ): Info = {
      val __obj = js.Dynamic.literal(_duration_hms = _duration_hms.asInstanceOf[js.Any], _duration_raw = _duration_raw.asInstanceOf[js.Any], _filename = _filename.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def set_duration_hms(value: String): Self = StObject.set(x, "_duration_hms", value.asInstanceOf[js.Any])
      
      inline def set_duration_raw(value: Double): Self = StObject.set(x, "_duration_raw", value.asInstanceOf[js.Any])
      
      inline def set_filename(value: String): Self = StObject.set(x, "_filename", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var auto: js.UndefOr[Boolean] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    }
  }
  
  @js.native
  trait Youtubedl extends Readable {
    
    def on(event: info | complete, listener: js.Function1[/* info */ Info, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_next(event: next, listener: js.Function1[/* data */ Info | js.Array[Info], Unit]): this.type = js.native
  }
}
