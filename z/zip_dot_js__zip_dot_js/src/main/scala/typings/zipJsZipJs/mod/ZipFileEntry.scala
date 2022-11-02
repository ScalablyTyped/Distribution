package typings.zipJsZipJs.mod

import typings.std.Blob
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "ZipFileEntry")
@js.native
open class ZipFileEntry[ReaderType, WriterType] ()
  extends StObject
     with ZipEntry {
  
  /**
    * The children of the entry.
    */
  /* CompleteClass */
  var children: js.Array[ZipEntry] = js.native
  
  /**
    * `void` for {@link ZipFileEntry} instances.
    */
  var directory: Unit = js.native
  
  /**
    * Retrieves the content of the entry as a `Blob` instance
    * 
    * @param mimeType The MIME type of the content.
    * @param options The options.
    * @returns A promise resolving to a `Blob` instance.
    */
  def getBlob(): js.Promise[Blob] = js.native
  def getBlob(mimeType: String): js.Promise[Blob] = js.native
  def getBlob(mimeType: String, options: EntryGetDataOptions): js.Promise[Blob] = js.native
  def getBlob(mimeType: Unit, options: EntryGetDataOptions): js.Promise[Blob] = js.native
  
  /**
    * Retrieves the content of the entry via a {@link Writer} instance
    * 
    * @param writer The {@link Writer} instance.
    * @param options The options.
    * @returns A promise resolving to data associated to the {@link Writer} instance.
    */
  def getData(writer: Writer[WriterType]): js.Promise[WriterType] = js.native
  def getData(writer: Writer[WriterType], options: EntryGetDataOptions): js.Promise[WriterType] = js.native
  
  /**
    * Retrieves the content of the entry as as a Data URI `string` encoded in Base64
    * 
    * @param mimeType The MIME type of the content.
    * @param options The options.
    * @returns A promise resolving to a Data URI `string` encoded in Base64.
    */
  def getData64URI(): js.Promise[String] = js.native
  def getData64URI(mimeType: String): js.Promise[String] = js.native
  def getData64URI(mimeType: String, options: EntryGetDataOptions): js.Promise[String] = js.native
  def getData64URI(mimeType: Unit, options: EntryGetDataOptions): js.Promise[String] = js.native
  
  /**
    * Returns the full filename of the entry
    */
  /* CompleteClass */
  override def getFullname(): String = js.native
  
  /**
    * Returns the filename of the entry relative to a parent directory
    */
  /* CompleteClass */
  override def getRelativeName(ancestor: ZipDirectoryEntry): String = js.native
  
  /**
    * Retrieves the text content of the entry as a `string`
    * 
    * @param encoding The encoding of the text.
    * @param options The options.
    * @returns A promise resolving to a `string`.
    */
  def getText(): js.Promise[String] = js.native
  def getText(encoding: String): js.Promise[String] = js.native
  def getText(encoding: String, options: EntryGetDataOptions): js.Promise[String] = js.native
  def getText(encoding: Unit, options: EntryGetDataOptions): js.Promise[String] = js.native
  
  /**
    * Retrieves the content of the entry as a `Uint8Array` instance
    * 
    * @param options The options.
    * @returns A promise resolving to a `Uint8Array` instance.
    */
  def getUint8Array(): js.Promise[js.typedarray.Uint8Array] = js.native
  def getUint8Array(options: EntryGetDataOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * Retrieves the content of the entry via a `WritableStream` instance
    * 
    * @param writable The `WritableStream` instance.
    * @param options The options.
    * @returns A promise resolving to the `WritableStream` instance.
    */
  def getWritable(): js.Promise[WritableStream[Any]] = js.native
  def getWritable(writable: Unit, options: EntryGetDataOptions): js.Promise[WritableStream[Any]] = js.native
  def getWritable(writable: WritableStream[Any]): js.Promise[WritableStream[Any]] = js.native
  def getWritable(writable: WritableStream[Any], options: EntryGetDataOptions): js.Promise[WritableStream[Any]] = js.native
  
  /**
    * The ID of the instance.
    */
  /* CompleteClass */
  var id: Double = js.native
  
  /**
    * Tests if a {@link ZipDirectoryEntry} instance is an ancestor of the entry
    * 
    * @param ancestor The {@link ZipDirectoryEntry} instance.
    */
  /* CompleteClass */
  override def isDescendantOf(ancestor: ZipDirectoryEntry): Boolean = js.native
  
  /**
    * The relative filename of the entry.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * The {@link Reader} instance used to read the content of the entry.
    */
  var reader: Reader[ReaderType] | ReadableReader = js.native
  
  /**
    * Replaces the content of the entry with a `Blob` instance
    * 
    * @param blob The `Blob` instance.
    */
  def replaceBlob(blob: Blob): Unit = js.native
  
  /**
    * Replaces the content of the entry with a Data URI `string` encoded in Base64
    * 
    * @param dataURI The Data URI `string` encoded in Base64.
    */
  def replaceData64URI(dataURI: String): Unit = js.native
  
  /**
    * Replaces the content of the entry with a `ReadableStream` instance
    * 
    * @param readable The `ReadableStream` instance.
    */
  def replaceReadable(readable: ReadableStream[Any]): Unit = js.native
  
  /**
    * Replaces the content of the entry with a `string`
    * 
    * @param text The `string`.
    */
  def replaceText(text: String): Unit = js.native
  
  /**
    * Replaces the content of the entry with a `Uint8Array` instance
    * 
    * @param array The `Uint8Array` instance.
    */
  def replaceUint8Array(array: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * The uncompressed size of the content.
    */
  /* CompleteClass */
  var uncompressedSize: Double = js.native
  
  /**
    * The {@link Writer} instance used to write the content of the entry.
    */
  var writer: Writer[WriterType] | WritableWriter = js.native
}
