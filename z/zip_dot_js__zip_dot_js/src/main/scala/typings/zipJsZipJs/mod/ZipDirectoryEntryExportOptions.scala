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
    
    inline def setRelativePath(value: Boolean): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
  }
}
