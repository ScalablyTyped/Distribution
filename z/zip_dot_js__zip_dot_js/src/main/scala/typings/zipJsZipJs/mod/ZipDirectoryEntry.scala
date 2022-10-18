package typings.zipJsZipJs.mod

import typings.std.Blob
import typings.std.FileSystemEntry
import typings.std.ReadableStream
import typings.std.WritableStream
import typings.zipJsZipJs.zipJsZipJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "ZipDirectoryEntry")
@js.native
open class ZipDirectoryEntry ()
  extends StObject
     with ZipEntry {
  
  /**
    * Adds aentry entry with content provided as a `Blob` instance
    * 
    * @param name The relative filename of the entry.
    * @param blob The `Blob` instance. 
    * @returns A `ZipFileEntry` instance.
    */
  def addBlob(name: String, blob: Blob): ZipFileEntry[Blob, Blob] = js.native
  
  /**
    * Adds aentry entry with content provided as a Data URI `string` encoded in Base64
    * 
    * @param name The relative filename of the entry.
    * @param dataURI The Data URI `string` encoded in Base64.
    * @returns A `ZipFileEntry` instance.
    */
  def addData64URI(name: String, dataURI: String): ZipFileEntry[String, String] = js.native
  
  /**
    * Adds a directory
    * 
    * @param name The relative filename of the directory
    * @returns A `ZipDirectoryEntry` instance.
    */
  def addDirectory(name: String): ZipDirectoryEntry = js.native
  
  /**
    * Adds an entry with content provided via a `FileSystemEntry` instance
    * 
    * @param fileSystemEntry The `FileSystemEntry` instance. 
    * @returns A promise resolving to a `ZipFileEntry` or a `ZipDirectoryEntry` instance.
    */
  def addFileSystemEntry(fileSystemEntry: FileSystemEntry): js.Promise[ZipEntry] = js.native
  
  /**
    * Adds an entry with content fetched from a URL
    * 
    * @param name The relative filename of the entry.
    * @param url The URL.
    * @param options The options. 
    * @returns A `ZipFileEntry` instance.
    */
  def addHttpContent(name: String, url: String): ZipFileEntry[String, Unit] = js.native
  def addHttpContent(name: String, url: String, options: HttpOptions): ZipFileEntry[String, Unit] = js.native
  
  /**
    * Adds aentry entry with content provided via a `ReadableStream` instance
    * 
    * @param name The relative filename of the entry.
    * @param readable The `ReadableStream` instance. 
    * @returns A `ZipFileEntry` instance.
    */
  def addReadable(name: String, readable: ReadableStream[Any]): ZipFileEntry[ReadableStream[Any], Unit] = js.native
  
  /**
    * Adds an entry with content provided as text
    * 
    * @param name The relative filename of the entry.
    * @param text The text. 
    * @returns A `ZipFileEntry` instance.
    */
  def addText(name: String, text: String): ZipFileEntry[String, String] = js.native
  
  /**
    * Adds an entry with content provided as a `Uint8Array` instance
    * 
    * @param name The relative filename of the entry.
    * @param array The `Uint8Array` instance. 
    * @returns A `ZipFileEntry` instance.
    */
  def addUint8Array(name: String, array: js.typedarray.Uint8Array): ZipFileEntry[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
  
  /**
    * The children of the entry.
    */
  /* CompleteClass */
  var children: js.Array[ZipEntry] = js.native
  
  /**
    * `true` for `ZipDirectoryEntry` instances.
    */
  var directory: `true` = js.native
  
  /**
    * Returns a `Blob` instance containing a zip file of the entry and its descendants, if unknown
    * 
    * @param options  The options.
    * @returns A promise resolving to the `Blob` instance.
    */
  def exportBlob(): js.Promise[Blob] = js.native
  def exportBlob(options: ZipDirectoryEntryExportOptions): js.Promise[Blob] = js.native
  
  /**
    * Returns a Data URI `string` encoded in Base64 containing a zip file of the entry and its descendants, if unknown
    * 
    * @param options  The options.
    * @returns A promise resolving to the Data URI `string` encoded in Base64.
    */
  def exportData64URI(): js.Promise[String] = js.native
  def exportData64URI(options: ZipDirectoryEntryExportOptions): js.Promise[String] = js.native
  
  /**
    * Returns a `Uint8Array` instance containing a zip file of the entry and its descendants, if unknown
    * 
    * @param options  The options.
    * @returns A promise resolving to the `Uint8Array` instance.
    */
  def exportUint8Array(): js.Promise[js.typedarray.Uint8Array] = js.native
  def exportUint8Array(options: ZipDirectoryEntryExportOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * Creates a zip file via a `WritableStream` instance containing the entry and its descendants, if unknown
    * 
    * @param writable The `WritableStream` instance.
    * @param options  The options.
    * @returns A promise resolving to the `Uint8Array` instance.
    */
  def exportWritable(): js.Promise[WritableStream[Any]] = js.native
  def exportWritable(writable: Unit, options: ZipDirectoryEntryExportOptions): js.Promise[WritableStream[Any]] = js.native
  def exportWritable(writable: WritableStream[Any]): js.Promise[WritableStream[Any]] = js.native
  def exportWritable(writable: WritableStream[Any], options: ZipDirectoryEntryExportOptions): js.Promise[WritableStream[Any]] = js.native
  
  /**
    * Gets a `ZipEntry` child instance from its relative filename
    * 
    * @param name The relative filename.
    * @returns A `ZipFileEntry` or a `ZipDirectoryEntry` instance (use the `directory` property to differentiate entries).
    */
  def getChildByName(name: String): js.UndefOr[ZipEntry] = js.native
  
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
    * The ID of the instance.
    */
  /* CompleteClass */
  var id: Double = js.native
  
  /**
    * Extracts a zip file provided as a `Blob` instance into the entry
    * 
    * @param blob The `Blob` instance.
    * @param options  The options.
    */
  def importBlob(blob: Blob): js.Promise[Unit] = js.native
  def importBlob(blob: Blob, options: ZipReaderConstructorOptions): js.Promise[Unit] = js.native
  
  /**
    * Extracts a zip file provided as a Data URI `string` encoded in Base64 into the entry
    * 
    * @param dataURI The Data URI `string` encoded in Base64.
    * @param options  The options.
    */
  def importData64URI(dataURI: String): js.Promise[Unit] = js.native
  def importData64URI(dataURI: String, options: ZipReaderConstructorOptions): js.Promise[Unit] = js.native
  
  /**
    * Extracts a zip file fetched from a URL into the entry
    * 
    * @param url The URL.
    * @param options  The options.
    */
  def importHttpContent(url: String): js.Promise[Unit] = js.native
  def importHttpContent(url: String, options: ZipDirectoryEntryImportHttpOptions): js.Promise[Unit] = js.native
  
  /**
    * Extracts a zip file provided via a `ReadableStream` instance into the entry
    * 
    * @param readable The `ReadableStream` instance.
    * @param options  The options.
    */
  def importReadable(readable: ReadableStream[Any]): js.Promise[Unit] = js.native
  def importReadable(readable: ReadableStream[Any], options: ZipReaderConstructorOptions): js.Promise[Unit] = js.native
  
  /**
    * Extracts a zip file provided as a `Uint8Array` instance into the entry
    * 
    * @param array The `Uint8Array` instance.
    * @param options  The options.
    */
  def importUint8Array(array: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  def importUint8Array(array: js.typedarray.Uint8Array, options: ZipReaderConstructorOptions): js.Promise[Unit] = js.native
  
  /**
    * Tests if a `ZipDirectoryEntry` instance is an ancestor of the entry
    * 
    * @param ancestor The `ZipDirectoryEntry` instance.
    */
  /* CompleteClass */
  override def isDescendantOf(ancestor: ZipDirectoryEntry): Boolean = js.native
  
  /**
    * The relative filename of the entry.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * The uncompressed size of the content.
    */
  /* CompleteClass */
  var uncompressedSize: Double = js.native
}
