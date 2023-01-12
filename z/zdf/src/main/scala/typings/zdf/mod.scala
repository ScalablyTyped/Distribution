package typings.zdf

import typings.zdf.anon.Quality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downloadStream(url: String, output: String, handle: js.Function1[/* progress */ ZdfProgress, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadStream")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadStream(
    url: String,
    output: String,
    handle: js.Function1[/* progress */ ZdfProgress, Unit],
    streamInfo: ZdfInfo
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadStream")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any], handle.asInstanceOf[js.Any], streamInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadStream(url: String, output: Unit, handle: js.Function1[/* progress */ ZdfProgress, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadStream")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadStream(
    url: String,
    output: Unit,
    handle: js.Function1[/* progress */ ZdfProgress, Unit],
    streamInfo: ZdfInfo
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadStream")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any], handle.asInstanceOf[js.Any], streamInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadStream(url: Unit, output: String, handle: js.Function1[/* progress */ ZdfProgress, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadStream")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadStream(
    url: Unit,
    output: String,
    handle: js.Function1[/* progress */ ZdfProgress, Unit],
    streamInfo: ZdfInfo
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadStream")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any], handle.asInstanceOf[js.Any], streamInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadStream(url: Unit, output: Unit, handle: js.Function1[/* progress */ ZdfProgress, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadStream")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadStream(
    url: Unit,
    output: Unit,
    handle: js.Function1[/* progress */ ZdfProgress, Unit],
    streamInfo: ZdfInfo
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadStream")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any], handle.asInstanceOf[js.Any], streamInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSources(url: String, handle: js.Function1[/* result */ ZdfInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSources")(url.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getSources(
    url: String,
    handle: js.Function1[/* result */ ZdfInfo, Unit],
    handleInfo: js.Function1[/* result */ ZdfInfoMeta, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSources")(url.asInstanceOf[js.Any], handle.asInstanceOf[js.Any], handleInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ZdfInfo extends StObject {
    
    val files: js.Array[Quality]
    
    val info: ZdfInfoMeta
    
    val stream: js.Array[String]
  }
  object ZdfInfo {
    
    inline def apply(files: js.Array[Quality], info: ZdfInfoMeta, stream: js.Array[String]): ZdfInfo = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZdfInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZdfInfo] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: js.Array[Quality]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: Quality*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setInfo(value: ZdfInfoMeta): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setStream(value: js.Array[String]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamVarargs(value: String*): Self = StObject.set(x, "stream", js.Array(value*))
    }
  }
  
  trait ZdfInfoMeta extends StObject {
    
    val preview: String
    
    val teasertext: String
    
    val title: String
  }
  object ZdfInfoMeta {
    
    inline def apply(preview: String, teasertext: String, title: String): ZdfInfoMeta = {
      val __obj = js.Dynamic.literal(preview = preview.asInstanceOf[js.Any], teasertext = teasertext.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZdfInfoMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZdfInfoMeta] (val x: Self) extends AnyVal {
      
      inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setTeasertext(value: String): Self = StObject.set(x, "teasertext", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZdfProgress extends StObject {
    
    val all: Double
    
    val length: Double
    
    val parts: Double
    
    val time: Double
    
    val total: Double
  }
  object ZdfProgress {
    
    inline def apply(all: Double, length: Double, parts: Double, time: Double, total: Double): ZdfProgress = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZdfProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZdfProgress] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
