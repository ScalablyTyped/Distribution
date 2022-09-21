package typings.zipJsZipJs.mod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "BlobWriter")
@js.native
/**
  * Creates the `BlobWriter` instance
  * 
  * @param mimeString The MIME type of the content.
  */
open class BlobWriter () extends Writer[Blob] {
  def this(mimeString: String) = this()
}
