package typings.zui

import typings.zui.anon.Crop
import typings.zui.anon.Error
import typings.zui.anon.Height
import typings.zui.anon.Id
import typings.zui.anon.Maxfilesize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * uploader
  */
@js.native
trait UploaderOption extends StObject {
  
  var autoUpload: js.UndefOr[Boolean] = js.native
  
  var browseByClickList: js.UndefOr[Boolean] = js.native
  
  var browse_button: js.UndefOr[String] = js.native
  
  var chunk_size: js.UndefOr[String] = js.native
  
  var deleteActionOnDone: js.UndefOr[Boolean] = js.native
  
  var deleteConfirm: js.UndefOr[Boolean | String] = js.native
  
  var dropPlaceholder: js.UndefOr[Boolean] = js.native
  
  var drop_element: js.UndefOr[String] = js.native
  
  var fileFormater: js.UndefOr[js.Function3[/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS, Unit]] = js.native
  
  var fileIconCreator: js.UndefOr[
    js.Function3[/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader, Unit]
  ] = js.native
  
  var fileList: js.UndefOr[String] = js.native
  
  var fileTemplate: js.UndefOr[String] = js.native
  
  var file_data_name: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[Maxfilesize] = js.native
  
  var flash_swf_url: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var limitFilesCount: js.UndefOr[Boolean | Double] = js.native
  
  var max_retries: js.UndefOr[Double] = js.native
  
  var multi_selection: js.UndefOr[Boolean] = js.native
  
  var multipart: js.UndefOr[Boolean] = js.native
  
  var multipart_params: js.UndefOr[js.Object | CallBack] = js.native
  
  var onBeforeUpload: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.native
  
  var onChunkUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var onFileUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.native
  
  var onFilesAdded: js.UndefOr[js.Function1[/* fiels */ js.Array[FileObj], Unit]] = js.native
  
  var onFilesRemoved: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.native
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onQueueChanged: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onStateChanged: js.UndefOr[js.Function1[/* status */ STATUS, Unit]] = js.native
  
  var onUploadComplete: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.native
  
  var onUploadFile: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.native
  
  var onUploadProgress: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.native
  
  var previewImageIcon: js.UndefOr[Boolean] = js.native
  
  var previewImageSize: js.UndefOr[Height] = js.native
  
  var qiniu: js.UndefOr[js.Object] = js.native
  
  var removeUploaded: js.UndefOr[Boolean] = js.native
  
  var rename: js.UndefOr[Boolean] = js.native
  
  var renameActionOnDone: js.UndefOr[Boolean] = js.native
  
  var renameByClick: js.UndefOr[Boolean] = js.native
  
  var renameExtension: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[Crop] = js.native
  
  var responseHandler: js.UndefOr[Boolean | CallBack] = js.native
  
  var runtimes: js.UndefOr[String] = js.native
  
  var sendFileId: js.UndefOr[Boolean] = js.native
  
  var sendFileName: js.UndefOr[Boolean] = js.native
  
  var silverlight_xap_url: js.UndefOr[String] = js.native
  
  var staticFiles: js.UndefOr[js.Array[Id]] = js.native
  
  var statusCreator: js.UndefOr[
    js.Function3[/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader, Unit]
  ] = js.native
  
  var unique_names: js.UndefOr[Boolean] = js.native
  
  var uploadedMessage: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
}
object UploaderOption {
  
  @scala.inline
  def apply(url: String): UploaderOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploaderOption]
  }
  
  @scala.inline
  implicit class UploaderOptionMutableBuilder[Self <: UploaderOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
    
    @scala.inline
    def setBrowseByClickList(value: Boolean): Self = StObject.set(x, "browseByClickList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowseByClickListUndefined: Self = StObject.set(x, "browseByClickList", js.undefined)
    
    @scala.inline
    def setBrowse_button(value: String): Self = StObject.set(x, "browse_button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowse_buttonUndefined: Self = StObject.set(x, "browse_button", js.undefined)
    
    @scala.inline
    def setChunk_size(value: String): Self = StObject.set(x, "chunk_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk_sizeUndefined: Self = StObject.set(x, "chunk_size", js.undefined)
    
    @scala.inline
    def setDeleteActionOnDone(value: Boolean): Self = StObject.set(x, "deleteActionOnDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteActionOnDoneUndefined: Self = StObject.set(x, "deleteActionOnDone", js.undefined)
    
    @scala.inline
    def setDeleteConfirm(value: Boolean | String): Self = StObject.set(x, "deleteConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteConfirmUndefined: Self = StObject.set(x, "deleteConfirm", js.undefined)
    
    @scala.inline
    def setDropPlaceholder(value: Boolean): Self = StObject.set(x, "dropPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPlaceholderUndefined: Self = StObject.set(x, "dropPlaceholder", js.undefined)
    
    @scala.inline
    def setDrop_element(value: String): Self = StObject.set(x, "drop_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrop_elementUndefined: Self = StObject.set(x, "drop_element", js.undefined)
    
    @scala.inline
    def setFileFormater(value: (/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS) => Unit): Self = StObject.set(x, "fileFormater", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFileFormaterUndefined: Self = StObject.set(x, "fileFormater", js.undefined)
    
    @scala.inline
    def setFileIconCreator(value: (/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader) => Unit): Self = StObject.set(x, "fileIconCreator", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFileIconCreatorUndefined: Self = StObject.set(x, "fileIconCreator", js.undefined)
    
    @scala.inline
    def setFileList(value: String): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
    
    @scala.inline
    def setFileTemplate(value: String): Self = StObject.set(x, "fileTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTemplateUndefined: Self = StObject.set(x, "fileTemplate", js.undefined)
    
    @scala.inline
    def setFile_data_name(value: String): Self = StObject.set(x, "file_data_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_data_nameUndefined: Self = StObject.set(x, "file_data_name", js.undefined)
    
    @scala.inline
    def setFilters(value: Maxfilesize): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFlash_swf_url(value: String): Self = StObject.set(x, "flash_swf_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash_swf_urlUndefined: Self = StObject.set(x, "flash_swf_url", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLimitFilesCount(value: Boolean | Double): Self = StObject.set(x, "limitFilesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitFilesCountUndefined: Self = StObject.set(x, "limitFilesCount", js.undefined)
    
    @scala.inline
    def setMax_retries(value: Double): Self = StObject.set(x, "max_retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_retriesUndefined: Self = StObject.set(x, "max_retries", js.undefined)
    
    @scala.inline
    def setMulti_selection(value: Boolean): Self = StObject.set(x, "multi_selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulti_selectionUndefined: Self = StObject.set(x, "multi_selection", js.undefined)
    
    @scala.inline
    def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    @scala.inline
    def setMultipart_params(value: js.Object | CallBack): Self = StObject.set(x, "multipart_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipart_paramsFunction0(value: () => Unit): Self = StObject.set(x, "multipart_params", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMultipart_paramsUndefined: Self = StObject.set(x, "multipart_params", js.undefined)
    
    @scala.inline
    def setOnBeforeUpload(value: /* file */ FileObj => Unit): Self = StObject.set(x, "onBeforeUpload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeUploadUndefined: Self = StObject.set(x, "onBeforeUpload", js.undefined)
    
    @scala.inline
    def setOnChunkUploaded(value: (/* file */ FileObj, /* responseObject */ ResponseObject) => Unit): Self = StObject.set(x, "onChunkUploaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChunkUploadedUndefined: Self = StObject.set(x, "onChunkUploaded", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFileUploaded(value: (/* file */ FileObj, /* responseObject */ ResponseObject) => Unit): Self = StObject.set(x, "onFileUploaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFileUploadedUndefined: Self = StObject.set(x, "onFileUploaded", js.undefined)
    
    @scala.inline
    def setOnFilesAdded(value: /* fiels */ js.Array[FileObj] => Unit): Self = StObject.set(x, "onFilesAdded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFilesAddedUndefined: Self = StObject.set(x, "onFilesAdded", js.undefined)
    
    @scala.inline
    def setOnFilesRemoved(value: /* files */ js.Array[FileObj] => Unit): Self = StObject.set(x, "onFilesRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFilesRemovedUndefined: Self = StObject.set(x, "onFilesRemoved", js.undefined)
    
    @scala.inline
    def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    @scala.inline
    def setOnQueueChanged(value: () => Unit): Self = StObject.set(x, "onQueueChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnQueueChangedUndefined: Self = StObject.set(x, "onQueueChanged", js.undefined)
    
    @scala.inline
    def setOnStateChanged(value: /* status */ STATUS => Unit): Self = StObject.set(x, "onStateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStateChangedUndefined: Self = StObject.set(x, "onStateChanged", js.undefined)
    
    @scala.inline
    def setOnUploadComplete(value: /* files */ js.Array[FileObj] => Unit): Self = StObject.set(x, "onUploadComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUploadCompleteUndefined: Self = StObject.set(x, "onUploadComplete", js.undefined)
    
    @scala.inline
    def setOnUploadFile(value: /* file */ FileObj => Unit): Self = StObject.set(x, "onUploadFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUploadFileUndefined: Self = StObject.set(x, "onUploadFile", js.undefined)
    
    @scala.inline
    def setOnUploadProgress(value: /* file */ FileObj => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    @scala.inline
    def setPreviewImageIcon(value: Boolean): Self = StObject.set(x, "previewImageIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewImageIconUndefined: Self = StObject.set(x, "previewImageIcon", js.undefined)
    
    @scala.inline
    def setPreviewImageSize(value: Height): Self = StObject.set(x, "previewImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewImageSizeUndefined: Self = StObject.set(x, "previewImageSize", js.undefined)
    
    @scala.inline
    def setQiniu(value: js.Object): Self = StObject.set(x, "qiniu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQiniuUndefined: Self = StObject.set(x, "qiniu", js.undefined)
    
    @scala.inline
    def setRemoveUploaded(value: Boolean): Self = StObject.set(x, "removeUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUploadedUndefined: Self = StObject.set(x, "removeUploaded", js.undefined)
    
    @scala.inline
    def setRename(value: Boolean): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameActionOnDone(value: Boolean): Self = StObject.set(x, "renameActionOnDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameActionOnDoneUndefined: Self = StObject.set(x, "renameActionOnDone", js.undefined)
    
    @scala.inline
    def setRenameByClick(value: Boolean): Self = StObject.set(x, "renameByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameByClickUndefined: Self = StObject.set(x, "renameByClick", js.undefined)
    
    @scala.inline
    def setRenameExtension(value: Boolean): Self = StObject.set(x, "renameExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameExtensionUndefined: Self = StObject.set(x, "renameExtension", js.undefined)
    
    @scala.inline
    def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    @scala.inline
    def setResize(value: Crop): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setResponseHandler(value: Boolean | CallBack): Self = StObject.set(x, "responseHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHandlerFunction0(value: () => Unit): Self = StObject.set(x, "responseHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponseHandlerUndefined: Self = StObject.set(x, "responseHandler", js.undefined)
    
    @scala.inline
    def setRuntimes(value: String): Self = StObject.set(x, "runtimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimesUndefined: Self = StObject.set(x, "runtimes", js.undefined)
    
    @scala.inline
    def setSendFileId(value: Boolean): Self = StObject.set(x, "sendFileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendFileIdUndefined: Self = StObject.set(x, "sendFileId", js.undefined)
    
    @scala.inline
    def setSendFileName(value: Boolean): Self = StObject.set(x, "sendFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendFileNameUndefined: Self = StObject.set(x, "sendFileName", js.undefined)
    
    @scala.inline
    def setSilverlight_xap_url(value: String): Self = StObject.set(x, "silverlight_xap_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilverlight_xap_urlUndefined: Self = StObject.set(x, "silverlight_xap_url", js.undefined)
    
    @scala.inline
    def setStaticFiles(value: js.Array[Id]): Self = StObject.set(x, "staticFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticFilesUndefined: Self = StObject.set(x, "staticFiles", js.undefined)
    
    @scala.inline
    def setStaticFilesVarargs(value: Id*): Self = StObject.set(x, "staticFiles", js.Array(value :_*))
    
    @scala.inline
    def setStatusCreator(value: (/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader) => Unit): Self = StObject.set(x, "statusCreator", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStatusCreatorUndefined: Self = StObject.set(x, "statusCreator", js.undefined)
    
    @scala.inline
    def setUnique_names(value: Boolean): Self = StObject.set(x, "unique_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique_namesUndefined: Self = StObject.set(x, "unique_names", js.undefined)
    
    @scala.inline
    def setUploadedMessage(value: Boolean): Self = StObject.set(x, "uploadedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadedMessageUndefined: Self = StObject.set(x, "uploadedMessage", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
