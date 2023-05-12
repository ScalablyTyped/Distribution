package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the options passed to `{@link ZipDirectoryEntry}#export*()`.
  */
trait ZipDirectoryEntryExportOptions
  extends StObject
     with ZipWriterConstructorOptions
     with EntryDataOnprogressOptions {
  
  /**
    * The MIME type of the exported data when relevant.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The options passed to the Reader instances
    */
  var readerOptions: js.UndefOr[ZipReaderConstructorOptions] = js.undefined
  
  /**
    * `true` to use filenames relative to the entry instead of full filenames.
    */
  var relativePath: js.UndefOr[Boolean] = js.undefined
}
object ZipDirectoryEntryExportOptions {
  
  inline def apply(): ZipDirectoryEntryExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipDirectoryEntryExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipDirectoryEntryExportOptions] (val x: Self) extends AnyVal {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setReaderOptions(value: ZipReaderConstructorOptions): Self = StObject.set(x, "readerOptions", value.asInstanceOf[js.Any])
    
    inline def setReaderOptionsUndefined: Self = StObject.set(x, "readerOptions", js.undefined)
    
    inline def setRelativePath(value: Boolean): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
  }
}
