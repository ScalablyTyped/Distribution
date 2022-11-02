package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents options passed to the constructor of {@link ZipReader}, {@link ZipReader#getEntries} and {@link ZipReader#getEntriesGenerator}.
  */
trait GetEntriesOptions extends StObject {
  
  /**
    * The encoding of the comment of the entry.
    */
  var commentEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * The encoding of the filename of the entry.
    */
  var filenameEncoding: js.UndefOr[String] = js.undefined
}
object GetEntriesOptions {
  
  inline def apply(): GetEntriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEntriesOptions]
  }
  
  extension [Self <: GetEntriesOptions](x: Self) {
    
    inline def setCommentEncoding(value: String): Self = StObject.set(x, "commentEncoding", value.asInstanceOf[js.Any])
    
    inline def setCommentEncodingUndefined: Self = StObject.set(x, "commentEncoding", js.undefined)
    
    inline def setFilenameEncoding(value: String): Self = StObject.set(x, "filenameEncoding", value.asInstanceOf[js.Any])
    
    inline def setFilenameEncodingUndefined: Self = StObject.set(x, "filenameEncoding", js.undefined)
  }
}
