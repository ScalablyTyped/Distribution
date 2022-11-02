package typings.zipJsZipJs.mod

import typings.std.Blob
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "BlobWriter")
@js.native
/**
  * Creates the {@link BlobWriter} instance
  * 
  * @param mimeString The MIME type of the content.
  */
open class BlobWriter ()
  extends StObject
     with Initializable
     with WritableWriter {
  def this(mimeString: String) = this()
  
  /**
    * Retrieves all the written data
    * 
    * @returns A promise resolving to the written data.
    */
  def getData(): js.Promise[Blob] = js.native
  
  /**
    * Initializes the instance asynchronously
    */
  @JSName("init")
  def init_MBlobWriter(): js.Promise[Unit] = js.native
  
  /**
    * The `WritableStream` instance.
    */
  /* CompleteClass */
  var writable: WritableStream[Any] = js.native
}
