package typings.zipJsZipJs.mod

import typings.std.AsyncGenerator
import typings.std.Blob
import typings.std.File
import typings.std.FileSystemEntry
import typings.std.FileSystemHandle
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
    * @param options The options.
    * @returns A {@link ZipFileEntry} instance.
    */
  def addBlob(name: String, blob: Blob): ZipFileEntry[Blob, Blob] = js.native
  def addBlob(name: String, blob: Blob, options: ZipWriterAddDataOptions): ZipFileEntry[Blob, Blob] = js.native
  
  /**
    * Adds aentry entry with content provided as a Data URI `string` encoded in Base64
    *
    * @param name The relative filename of the entry.
    * @param dataURI The Data URI `string` encoded in Base64.
    * @param options The options.
    * @returns A {@link ZipFileEntry} instance.
    */
  def addData64URI(name: String, dataURI: String): ZipFileEntry[String, String] = js.native
  def addData64URI(name: String, dataURI: String, options: ZipWriterAddDataOptions): ZipFileEntry[String, String] = js.native
  
  /**
    * Adds a directory
    *
    * @param name The relative filename of the directory.
    * @param options The options.
    * @returns A {@link ZipDirectoryEntry} instance.
    */
  def addDirectory(name: String): ZipDirectoryEntry = js.native
  def addDirectory(name: String, options: ZipWriterAddDataOptions): ZipDirectoryEntry = js.native
  
  /**
    * Adds an entry with content provided via a `File` instance
    *
    * @param file The `File` instance.
    * @param options The options.
    * @returns A promise resolving to a {@link ZipFileEntry} or a {@link ZipDirectoryEntry} instance.
    */
  def addFile(file: File): js.Promise[ZipEntry] = js.native
  def addFile(file: File, options: ZipWriterAddDataOptions): js.Promise[ZipEntry] = js.native
  
  /**
    * Adds an entry with content provided via a `FileSystemEntry` instance
    *
    * @param fileSystemEntry The `FileSystemEntry` instance.
    * @param options The options.
    * @returns A promise resolving to an array of {@link ZipFileEntry} or a {@link ZipDirectoryEntry} instances.
    */
  def addFileSystemEntry(fileSystemEntry: FileSystemEntry): js.Promise[js.Array[ZipEntry]] = js.native
  def addFileSystemEntry(fileSystemEntry: FileSystemEntry, options: ZipWriterAddDataOptions): js.Promise[js.Array[ZipEntry]] = js.native
  
  /**
    * Adds an entry with content provided via a `FileSystemHandle` instance
    *
    * @param fileSystemHandle The `fileSystemHandle` instance.
    * @param options The options.
    * @returns A promise resolving to an array of {@link ZipFileEntry} or a {@link ZipDirectoryEntry} instances.
    */
  def addFileSystemHandle(fileSystemEntry: FileSystemHandle): js.Promise[js.Array[ZipEntry]] = js.native
  def addFileSystemHandle(fileSystemEntry: FileSystemHandle, options: ZipWriterAddDataOptions): js.Promise[js.Array[ZipEntry]] = js.native
  
  /**
    * Adds an entry with content fetched from a URL
    *
    * @param name The relative filename of the entry.
    * @param url The URL.
    * @param options The options.
    * @returns A {@link ZipFileEntry} instance.
    */
  def addHttpContent(name: String, url: String): ZipFileEntry[String, Unit] = js.native
  def addHttpContent(name: String, url: String, options: HttpOptions & ZipWriterAddDataOptions): ZipFileEntry[String, Unit] = js.native
  
  /**
    * Adds aentry entry with content provided via a `ReadableStream` instance
    *
    * @param name The relative filename of the entry.
    * @param readable The `ReadableStream` instance.
    * @param options The options.
    * @returns A {@link ZipFileEntry} instance.
    */
  def addReadable(name: String, readable: ReadableStream[Any]): ZipFileEntry[ReadableStream[Any], Unit] = js.native
  def addReadable(name: String, readable: ReadableStream[Any], options: ZipWriterAddDataOptions): ZipFileEntry[ReadableStream[Any], Unit] = js.native
  
  /**
    * Adds an entry with content provided as text
    *
    * @param name The relative filename of the entry.
    * @param text The text.
    * @param options The options.
    * @returns A {@link ZipFileEntry} instance.
    */
  def addText(name: String, text: String): ZipFileEntry[String, String] = js.native
  def addText(name: String, text: String, options: ZipWriterAddDataOptions): ZipFileEntry[String, String] = js.native
  
  /**
    * Adds an entry with content provided as a `Uint8Array` instance
    *
    * @param name The relative filename of the entry.
    * @param array The `Uint8Array` instance.
    * @param options The options.
    * @returns A {@link ZipFileEntry} instance.
    */
  def addUint8Array(name: String, array: js.typedarray.Uint8Array): ZipFileEntry[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
  def addUint8Array(name: String, array: js.typedarray.Uint8Array, options: ZipWriterAddDataOptions): ZipFileEntry[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
  
  /**
    * `true` for  {@link ZipDirectoryEntry} instances.
    */
  var directory: `true` = js.native
  
  /**
    * Returns a `Blob` instance containing a zip file of the entry and its descendants
    *
    * @param options  The options.
    * @returns A promise resolving to the `Blob` instance.
    */
  def exportBlob(): js.Promise[Blob] = js.native
  def exportBlob(options: ZipDirectoryEntryExportOptions): js.Promise[Blob] = js.native
  
  /**
    * Returns a Data URI `string` encoded in Base64 containing a zip file of the entry and its descendants
    *
    * @param options  The options.
    * @returns A promise resolving to the Data URI `string` encoded in Base64.
    */
  def exportData64URI(): js.Promise[String] = js.native
  def exportData64URI(options: ZipDirectoryEntryExportOptions): js.Promise[String] = js.native
  
  /**
    * Returns a `Uint8Array` instance containing a zip file of the entry and its descendants
    *
    * @param options  The options.
    * @returns A promise resolving to the `Uint8Array` instance.
    */
  def exportUint8Array(): js.Promise[js.typedarray.Uint8Array] = js.native
  def exportUint8Array(options: ZipDirectoryEntryExportOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * Creates a zip file via a `WritableStream` instance containing the entry and its descendants
    *
    * @param writable The `WritableStream` instance.
    * @param options  The options.
    * @returns A promise resolving to the `Uint8Array` instance.
    */
  def exportWritable(): js.Promise[WritableStream[Any]] = js.native
  def exportWritable(writable: Unit, options: ZipDirectoryEntryExportOptions): js.Promise[WritableStream[Any]] = js.native
  def exportWritable(writable: WritableStream[Any]): js.Promise[WritableStream[Any]] = js.native
  def exportWritable(writable: WritableStream[Any], options: ZipDirectoryEntryExportOptions): js.Promise[WritableStream[Any]] = js.native
  
  def exportZip(writer: AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Any, Any]): js.Promise[Any] = js.native
  def exportZip(
    writer: AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Any, Any],
    options: ZipDirectoryEntryExportOptions
  ): js.Promise[Any] = js.native
  def exportZip(writer: WritableStream[Any]): js.Promise[Any] = js.native
  def exportZip(writer: WritableStream[Any], options: ZipDirectoryEntryExportOptions): js.Promise[Any] = js.native
  def exportZip(writer: WritableWriter): js.Promise[Any] = js.native
  def exportZip(writer: WritableWriter, options: ZipDirectoryEntryExportOptions): js.Promise[Any] = js.native
  /**
    * Creates a zip file via a custom {@link Writer} instance containing the entry and its descendants
    *
    * @param writer The {@link Writer} instance.
    * @param options  The options.
    * @returns A promise resolving to the data.
    */
  def exportZip(writer: Writer[Any]): js.Promise[Any] = js.native
  def exportZip(writer: Writer[Any], options: ZipDirectoryEntryExportOptions): js.Promise[Any] = js.native
  
  /**
    * Gets a {@link ZipEntry} child instance from its relative filename
    *
    * @param name The relative filename.
    * @returns A {@link ZipFileEntry} or a {@link ZipDirectoryEntry} instance (use the {@link ZipFileEntry#directory} and {@link ZipDirectoryEntry#directory} properties to differentiate entries).
    */
  def getChildByName(name: String): js.UndefOr[ZipEntry] = js.native
  
  /**
    * Extracts a zip file provided as a `Blob` instance into the entry
    *
    * @param blob The `Blob` instance.
    * @param options  The options.
    */
  def importBlob(blob: Blob): js.Promise[js.Array[ZipEntry]] = js.native
  def importBlob(blob: Blob, options: ZipReaderConstructorOptions): js.Promise[js.Array[ZipEntry]] = js.native
  
  /**
    * Extracts a zip file provided as a Data URI `string` encoded in Base64 into the entry
    *
    * @param dataURI The Data URI `string` encoded in Base64.
    * @param options  The options.
    */
  def importData64URI(dataURI: String): js.Promise[js.Array[ZipEntry]] = js.native
  def importData64URI(dataURI: String, options: ZipReaderConstructorOptions): js.Promise[js.Array[ZipEntry]] = js.native
  
  /**
    * Extracts a zip file fetched from a URL into the entry
    *
    * @param url The URL.
    * @param options  The options.
    */
  def importHttpContent(url: String): js.Promise[js.Array[ZipEntry]] = js.native
  def importHttpContent(url: String, options: ZipDirectoryEntryImportHttpOptions): js.Promise[js.Array[ZipEntry]] = js.native
  
  /**
    * Extracts a zip file provided via a `ReadableStream` instance into the entry
    *
    * @param readable The `ReadableStream` instance.
    * @param options  The options.
    */
  def importReadable(readable: ReadableStream[Any]): js.Promise[js.Array[ZipEntry]] = js.native
  def importReadable(readable: ReadableStream[Any], options: ZipReaderConstructorOptions): js.Promise[js.Array[ZipEntry]] = js.native
  
  /**
    * Extracts a zip file provided as a `Uint8Array` instance into the entry
    *
    * @param array The `Uint8Array` instance.
    * @param options  The options.
    */
  def importUint8Array(array: js.typedarray.Uint8Array): js.Promise[js.Array[ZipEntry]] = js.native
  def importUint8Array(array: js.typedarray.Uint8Array, options: ZipReaderConstructorOptions): js.Promise[js.Array[ZipEntry]] = js.native
  
  def importZip(reader: js.Array[ReadableReader | ReadableStream[Any] | Reader[Any]]): js.Promise[js.Array[ZipEntry]] = js.native
  def importZip(
    reader: js.Array[ReadableReader | ReadableStream[Any] | Reader[Any]],
    options: ZipReaderConstructorOptions
  ): js.Promise[js.Array[ZipEntry]] = js.native
  def importZip(reader: ReadableStream[Any]): js.Promise[js.Array[ZipEntry]] = js.native
  def importZip(reader: ReadableStream[Any], options: ZipReaderConstructorOptions): js.Promise[js.Array[ZipEntry]] = js.native
  def importZip(reader: ReadableReader): js.Promise[js.Array[ZipEntry]] = js.native
  def importZip(reader: ReadableReader, options: ZipReaderConstructorOptions): js.Promise[js.Array[ZipEntry]] = js.native
  /**
    * Extracts a zip file provided via a custom {@link Reader} instance into the entry
    *
    * @param reader The {@link Reader} instance.
    * @param options  The options.
    */
  def importZip(reader: Reader[Any]): js.Promise[js.Array[ZipEntry]] = js.native
  def importZip(reader: Reader[Any], options: ZipReaderConstructorOptions): js.Promise[js.Array[ZipEntry]] = js.native
}
