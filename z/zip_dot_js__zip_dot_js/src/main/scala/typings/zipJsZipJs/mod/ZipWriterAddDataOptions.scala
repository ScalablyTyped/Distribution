package typings.zipJsZipJs.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the options passed to `ZipWriter#add()`.
  */
trait ZipWriterAddDataOptions
  extends StObject
     with ZipWriterConstructorOptions
     with EntryDataOnprogressOptions
     with WorkerConfiguration {
  
  /**
    * The comment of the entry.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * `true` if the entry is a directory.
    * 
    * @defaultValue false
    */
  var directory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The extra field of the entry.
    */
  var extraField: js.UndefOr[Map[Double, js.typedarray.Uint8Array]] = js.undefined
}
object ZipWriterAddDataOptions {
  
  inline def apply(): ZipWriterAddDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipWriterAddDataOptions]
  }
  
  extension [Self <: ZipWriterAddDataOptions](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setExtraField(value: Map[Double, js.typedarray.Uint8Array]): Self = StObject.set(x, "extraField", value.asInstanceOf[js.Any])
    
    inline def setExtraFieldUndefined: Self = StObject.set(x, "extraField", js.undefined)
  }
}
