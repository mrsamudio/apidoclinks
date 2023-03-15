package io.github.mrsamudio;

import java.util.HashMap;
import java.util.Set;

/**
 * ApiDocLinks class
 * @author mikodev
 *
 */
public class ApiDocLinks {
	
	private static final String JAVA11_DOMAIN = "https://docs.oracle.com/en/java/javase/11/docs/api/";
	private static final String JAVA17_DOMAIN = "https://docs.oracle.com/en/java/javase/17/docs/api/";
	private static String AEM_DOMAIN = "https://developer.adobe.com/experience-manager/reference-materials/6-5/javadoc/";

	private static final HashMap<Class<? extends Throwable>, String> EXCEPTIONURLS = fillGreatHash();

	/**
	 * Get a url official api doc
	 * @param exceptionClass the exception class
	 * @return string url
	 */
	public static final String getUrl(Class<? extends Throwable> exceptionClass) {
		HashMap<Class<? extends Throwable>, String> exceptionUrls = fillGreatHash();
		return exceptionUrls.get(exceptionClass);
	}

	/**
	 * Just print info or related class with url offical api doc
	 * @param exceptionClass the exception class
	 * @return true or false depends on
	 */
	public static final boolean printInfo(Class<? extends Throwable> exceptionClass) {
		if (!EXCEPTIONURLS.get(exceptionClass).isEmpty()) {
			System.out.println("Nombre de Clase: " + exceptionClass.getName());
			System.out.println("Documentación oficial: " + EXCEPTIONURLS.get(exceptionClass));
			return true;
		} else {
			System.out.println(
					"No se encontró la URL de documentación oficial para la excepción " + exceptionClass.getName());
			return false;
		}
	}

	/**
	 * Get a url official aem api doc
	 * @param exceptionClass the exception class
	 * @return String aem url
	 */
	public static final String getAEMUrl(Class<? extends Throwable> exceptionClass) {
		HashMap<Class<? extends Throwable>, String> exceptionUrls = fillAEMHash();
		return exceptionUrls.get(exceptionClass);
	}
	
	/**
	 *  fillGreatHash
	 * @return hashMap with all urls api docs
	 */
	private static final HashMap<Class<? extends Throwable>, String> fillGreatHash() {
		HashMap<Class<? extends Throwable>, String> urls = new HashMap<>();
		urls.putAll(fillJavaHash());
		urls.putAll(fillAEMHash());
		
		return urls;
	}
	
	/**
	 * getKeySet
	 * @return Set of keys
	 */
	public static final Set<Class<? extends Throwable>> getKeySet() {
		return EXCEPTIONURLS.keySet();
	}
	
	/**
	 * fillJavaHash
	 * @return hashMap with java urls api docs
	 */
	private static final HashMap<Class<? extends Throwable>, String> fillJavaHash() {
		HashMap<Class<? extends Throwable>, String> urls = new HashMap<>();
		urls.put(java.io.CharConversionException.class,
				JAVA11_DOMAIN.concat("java.base/java/io/CharConversionException.html"));
		urls.put(java.io.EOFException.class, JAVA11_DOMAIN.concat("java.base/java/io/EOFException.html"));
		urls.put(java.io.FileNotFoundException.class, JAVA11_DOMAIN.concat("java.base/java/io/FileNotFoundException.html"));
		urls.put(java.io.IOException.class, JAVA11_DOMAIN.concat("java.base/java/io/IOException.html"));
		urls.put(java.io.InterruptedIOException.class, JAVA11_DOMAIN.concat("java.base/java/io/InterruptedIOException.html"));
		urls.put(java.io.InvalidClassException.class, JAVA11_DOMAIN.concat("java.base/java/io/InvalidClassException.html"));
		urls.put(java.io.InvalidObjectException.class, JAVA11_DOMAIN.concat("java.base/java/io/InvalidObjectException.html"));
		urls.put(java.io.NotActiveException.class, JAVA11_DOMAIN.concat("java.base/java/io/NotActiveException.html"));
		urls.put(java.io.NotSerializableException.class,
				JAVA11_DOMAIN.concat("java.base/java/io/NotSerializableException.html"));
		urls.put(java.io.ObjectStreamException.class, JAVA11_DOMAIN.concat("java.base/java/io/ObjectStreamException.html"));
		urls.put(java.io.OptionalDataException.class, JAVA11_DOMAIN.concat("java.base/java/io/OptionalDataException.html"));
		urls.put(java.io.StreamCorruptedException.class,
				JAVA11_DOMAIN.concat("java.base/java/io/StreamCorruptedException.html"));
		urls.put(java.io.SyncFailedException.class, JAVA11_DOMAIN.concat("java.base/java/io/SyncFailedException.html"));
		urls.put(java.io.UTFDataFormatException.class, JAVA11_DOMAIN.concat("java.base/java/io/UTFDataFormatException.html"));
		urls.put(java.io.UncheckedIOException.class, JAVA11_DOMAIN.concat("java.base/java/io/UncheckedIOException.html"));
		urls.put(java.io.UnsupportedEncodingException.class,
				JAVA11_DOMAIN.concat("java.base/java/io/UnsupportedEncodingException.html"));
		urls.put(java.io.WriteAbortedException.class, JAVA11_DOMAIN.concat("java.base/java/io/WriteAbortedException.html"));
		urls.put(java.lang.ArithmeticException.class, JAVA11_DOMAIN.concat("java.base/java/lang/ArithmeticException.html"));
		urls.put(java.lang.ArrayIndexOutOfBoundsException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/ArrayIndexOutOfBoundsException.html"));
		urls.put(java.lang.ArrayStoreException.class, JAVA11_DOMAIN.concat("java.base/java/lang/ArrayStoreException.html"));
		urls.put(java.lang.ClassCastException.class, JAVA11_DOMAIN.concat("java.base/java/lang/ClassCastException.html"));
		urls.put(java.lang.ClassNotFoundException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/ClassNotFoundException.html"));
		urls.put(java.lang.CloneNotSupportedException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/CloneNotSupportedException.html"));
		urls.put(java.lang.EnumConstantNotPresentException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/EnumConstantNotPresentException.html"));
		urls.put(java.lang.Exception.class, JAVA11_DOMAIN.concat("java.base/java/lang/Exception.html"));
		urls.put(java.lang.ExceptionInInitializerError.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/ExceptionInInitializerError.html"));
		urls.put(java.lang.IllegalAccessException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalAccessException.html"));
		urls.put(java.lang.IllegalArgumentException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalArgumentException.html"));
		urls.put(java.lang.IllegalCallerException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalCallerException.html"));
		urls.put(java.lang.IllegalMonitorStateException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalMonitorStateException.html"));
		urls.put(java.lang.IllegalStateException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalStateException.html"));
		urls.put(java.lang.IllegalThreadStateException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/IllegalThreadStateException.html"));
		urls.put(java.lang.IndexOutOfBoundsException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/IndexOutOfBoundsException.html"));
		urls.put(java.lang.InstantiationException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/InstantiationException.html"));
		urls.put(java.lang.InterruptedException.class, JAVA11_DOMAIN.concat("java.base/java/lang/InterruptedException.html"));
		urls.put(java.lang.LayerInstantiationException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/LayerInstantiationException.html"));
		urls.put(java.lang.NegativeArraySizeException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/NegativeArraySizeException.html"));
		urls.put(java.lang.NoSuchFieldException.class, JAVA11_DOMAIN.concat("java.base/java/lang/NoSuchFieldException.html"));
		urls.put(java.lang.NoSuchMethodException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/NoSuchMethodException.html"));
		urls.put(java.lang.NullPointerException.class, JAVA11_DOMAIN.concat("java.base/java/lang/NullPointerException.html"));
		urls.put(java.lang.NumberFormatException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/NumberFormatException.html"));
		urls.put(java.lang.ReflectiveOperationException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/ReflectiveOperationException.html"));
		urls.put(java.lang.RuntimeException.class, JAVA11_DOMAIN.concat("java.base/java/lang/RuntimeException.html"));
		urls.put(java.lang.SecurityException.class, JAVA11_DOMAIN.concat("java.base/java/lang/SecurityException.html"));
		urls.put(java.lang.StringIndexOutOfBoundsException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/StringIndexOutOfBoundsException.html"));
//					exceptionUrls.put(java.lang.Thread.UncaughtExceptionHandler.class, DOMAIN.concat("java.base/java/lang/Thread.UncaughtExceptionHandler.html"));
		urls.put(java.lang.TypeNotPresentException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/TypeNotPresentException.html"));
		urls.put(java.lang.UnsupportedOperationException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/UnsupportedOperationException.html"));
		urls.put(java.lang.annotation.AnnotationTypeMismatchException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/annotation/AnnotationTypeMismatchException.html"));
		urls.put(java.lang.annotation.IncompleteAnnotationException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/annotation/IncompleteAnnotationException.html"));
		urls.put(java.lang.invoke.LambdaConversionException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/invoke/LambdaConversionException.html"));
		urls.put(java.lang.invoke.StringConcatException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/invoke/StringConcatException.html"));
		urls.put(java.lang.invoke.WrongMethodTypeException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/invoke/WrongMethodTypeException.html"));
		urls.put(java.lang.module.FindException.class, JAVA11_DOMAIN.concat("java.base/java/lang/module/FindException.html"));
		urls.put(java.lang.module.InvalidModuleDescriptorException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/module/InvalidModuleDescriptorException.html"));
		urls.put(java.lang.module.ResolutionException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/module/ResolutionException.html"));
		urls.put(java.lang.reflect.InaccessibleObjectException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/InaccessibleObjectException.html"));
		urls.put(java.lang.reflect.InvocationTargetException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/InvocationTargetException.html"));
		urls.put(java.lang.reflect.MalformedParameterizedTypeException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/MalformedParameterizedTypeException.html"));
		urls.put(java.lang.reflect.MalformedParametersException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/MalformedParametersException.html"));
		urls.put(java.lang.reflect.UndeclaredThrowableException.class,
				JAVA11_DOMAIN.concat("java.base/java/lang/reflect/UndeclaredThrowableException.html"));
		urls.put(java.net.BindException.class, JAVA11_DOMAIN.concat("java.base/java/net/BindException.html"));
		urls.put(java.net.ConnectException.class, JAVA11_DOMAIN.concat("java.base/java/net/ConnectException.html"));
		urls.put(java.net.HttpRetryException.class, JAVA11_DOMAIN.concat("java.base/java/net/HttpRetryException.html"));
		urls.put(java.net.MalformedURLException.class, JAVA11_DOMAIN.concat("java.base/java/net/MalformedURLException.html"));
		urls.put(java.net.NoRouteToHostException.class,
				JAVA11_DOMAIN.concat("java.base/java/net/NoRouteToHostException.html"));
		urls.put(java.net.PortUnreachableException.class,
				JAVA11_DOMAIN.concat("java.base/java/net/PortUnreachableException.html"));
		urls.put(java.net.ProtocolException.class, JAVA11_DOMAIN.concat("java.base/java/net/ProtocolException.html"));
		urls.put(java.net.SocketException.class, JAVA11_DOMAIN.concat("java.base/java/net/SocketException.html"));
		urls.put(java.net.SocketTimeoutException.class,
				JAVA11_DOMAIN.concat("java.base/java/net/SocketTimeoutException.html"));
		urls.put(java.net.URISyntaxException.class, JAVA11_DOMAIN.concat("java.base/java/net/URISyntaxException.html"));
		urls.put(java.net.UnknownHostException.class, JAVA11_DOMAIN.concat("java.base/java/net/UnknownHostException.html"));
		urls.put(java.net.UnknownServiceException.class,
				JAVA11_DOMAIN.concat("java.base/java/net/UnknownServiceException.html"));
		urls.put(java.nio.BufferOverflowException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/BufferOverflowException.html"));
		urls.put(java.nio.BufferUnderflowException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/BufferUnderflowException.html"));
		urls.put(java.nio.InvalidMarkException.class, JAVA11_DOMAIN.concat("java.base/java/nio/InvalidMarkException.html"));
		urls.put(java.nio.ReadOnlyBufferException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/ReadOnlyBufferException.html"));
		urls.put(java.nio.channels.AcceptPendingException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/AcceptPendingException.html"));
		urls.put(java.nio.channels.AlreadyBoundException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/AlreadyBoundException.html"));
		urls.put(java.nio.channels.AlreadyConnectedException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/AlreadyConnectedException.html"));
		urls.put(java.nio.channels.AsynchronousCloseException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/AsynchronousCloseException.html"));
		urls.put(java.nio.channels.CancelledKeyException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/CancelledKeyException.html"));
		urls.put(java.nio.channels.ClosedByInterruptException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ClosedByInterruptException.html"));
		urls.put(java.nio.channels.ClosedChannelException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ClosedChannelException.html"));
		urls.put(java.nio.channels.ClosedSelectorException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ClosedSelectorException.html"));
		urls.put(java.nio.channels.ConnectionPendingException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ConnectionPendingException.html"));
		urls.put(java.nio.channels.FileLockInterruptionException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/FileLockInterruptionException.html"));
		urls.put(java.nio.channels.IllegalBlockingModeException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/IllegalBlockingModeException.html"));
		urls.put(java.nio.channels.IllegalChannelGroupException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/IllegalChannelGroupException.html"));
		urls.put(java.nio.channels.IllegalSelectorException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/IllegalSelectorException.html"));
		urls.put(java.nio.channels.InterruptedByTimeoutException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/InterruptedByTimeoutException.html"));
		urls.put(java.nio.channels.NoConnectionPendingException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NoConnectionPendingException.html"));
		urls.put(java.nio.channels.NonReadableChannelException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NonReadableChannelException.html"));
		urls.put(java.nio.channels.NonWritableChannelException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NonWritableChannelException.html"));
		urls.put(java.nio.channels.NotYetBoundException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NotYetBoundException.html"));
		urls.put(java.nio.channels.NotYetConnectedException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/NotYetConnectedException.html"));
		urls.put(java.nio.channels.OverlappingFileLockException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/OverlappingFileLockException.html"));
		urls.put(java.nio.channels.ReadPendingException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ReadPendingException.html"));
		urls.put(java.nio.channels.ShutdownChannelGroupException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/ShutdownChannelGroupException.html"));
		urls.put(java.nio.channels.UnresolvedAddressException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/UnresolvedAddressException.html"));
		urls.put(java.nio.channels.UnsupportedAddressTypeException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/UnsupportedAddressTypeException.html"));
		urls.put(java.nio.channels.WritePendingException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/channels/WritePendingException.html"));
		urls.put(java.nio.charset.CharacterCodingException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/CharacterCodingException.html"));
		urls.put(java.nio.charset.IllegalCharsetNameException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/IllegalCharsetNameException.html"));
		urls.put(java.nio.charset.MalformedInputException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/MalformedInputException.html"));
		urls.put(java.nio.charset.UnmappableCharacterException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/UnmappableCharacterException.html"));
		urls.put(java.nio.charset.UnsupportedCharsetException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/charset/UnsupportedCharsetException.html"));
		urls.put(java.nio.file.AccessDeniedException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/AccessDeniedException.html"));
		urls.put(java.nio.file.AtomicMoveNotSupportedException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/AtomicMoveNotSupportedException.html"));
		urls.put(java.nio.file.ClosedDirectoryStreamException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ClosedDirectoryStreamException.html"));
		urls.put(java.nio.file.ClosedFileSystemException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ClosedFileSystemException.html"));
		urls.put(java.nio.file.ClosedWatchServiceException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ClosedWatchServiceException.html"));
		urls.put(java.nio.file.DirectoryIteratorException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/DirectoryIteratorException.html"));
		urls.put(java.nio.file.DirectoryNotEmptyException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/DirectoryNotEmptyException.html"));
		urls.put(java.nio.file.FileAlreadyExistsException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileAlreadyExistsException.html"));
		urls.put(java.nio.file.FileSystemAlreadyExistsException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileSystemAlreadyExistsException.html"));
		urls.put(java.nio.file.FileSystemException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileSystemException.html"));
		urls.put(java.nio.file.FileSystemLoopException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileSystemLoopException.html"));
		urls.put(java.nio.file.FileSystemNotFoundException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/FileSystemNotFoundException.html"));
		urls.put(java.nio.file.InvalidPathException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/InvalidPathException.html"));
		urls.put(java.nio.file.NoSuchFileException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/NoSuchFileException.html"));
		urls.put(java.nio.file.NotDirectoryException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/NotDirectoryException.html"));
		urls.put(java.nio.file.NotLinkException.class, JAVA11_DOMAIN.concat("java.base/java/nio/file/NotLinkException.html"));
		urls.put(java.nio.file.ProviderMismatchException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ProviderMismatchException.html"));
		urls.put(java.nio.file.ProviderNotFoundException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ProviderNotFoundException.html"));
		urls.put(java.nio.file.ReadOnlyFileSystemException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/ReadOnlyFileSystemException.html"));
		urls.put(java.nio.file.attribute.UserPrincipalNotFoundException.class,
				JAVA11_DOMAIN.concat("java.base/java/nio/file/attribute/UserPrincipalNotFoundException.html"));
		urls.put(java.security.AccessControlException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/AccessControlException.html"));
		urls.put(java.security.DigestException.class, JAVA11_DOMAIN.concat("java.base/java/security/DigestException.html"));
		urls.put(java.security.GeneralSecurityException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/GeneralSecurityException.html"));
		urls.put(java.security.InvalidAlgorithmParameterException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/InvalidAlgorithmParameterException.html"));
		urls.put(java.security.InvalidKeyException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/InvalidKeyException.html"));
		urls.put(java.security.InvalidParameterException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/InvalidParameterException.html"));
		urls.put(java.security.KeyException.class, JAVA11_DOMAIN.concat("java.base/java/security/KeyException.html"));
		urls.put(java.security.KeyManagementException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/KeyManagementException.html"));
		urls.put(java.security.KeyStoreException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/KeyStoreException.html"));
		urls.put(java.security.NoSuchAlgorithmException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/NoSuchAlgorithmException.html"));
		urls.put(java.security.NoSuchProviderException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/NoSuchProviderException.html"));
		urls.put(java.security.PrivilegedActionException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/PrivilegedActionException.html"));
//					exceptionUrls.put(java.security.PrivilegedExceptionAction.class, DOMAIN.concat("java.base/java/security/PrivilegedExceptionAction.html"));
		urls.put(java.security.ProviderException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/ProviderException.html"));
		urls.put(java.security.SignatureException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/SignatureException.html"));
		urls.put(java.security.UnrecoverableEntryException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/UnrecoverableEntryException.html"));
		urls.put(java.security.UnrecoverableKeyException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/UnrecoverableKeyException.html"));
		urls.put(java.security.cert.CRLException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CRLException.html"));
		urls.put(java.security.cert.CertPathBuilderException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertPathBuilderException.html"));
//					exceptionUrls.put(java.security.cert.CertPathValidatorException.BasicReason.class, DOMAIN.concat("java.base/java/security/cert/CertPathValidatorException.BasicReason.html"));
//					exceptionUrls.put(java.security.cert.CertPathValidatorException.Reason.class, DOMAIN.concat("java.base/java/security/cert/CertPathValidatorException.Reason.html"));
		urls.put(java.security.cert.CertPathValidatorException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertPathValidatorException.html"));
		urls.put(java.security.cert.CertStoreException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertStoreException.html"));
		urls.put(java.security.cert.CertificateEncodingException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateEncodingException.html"));
		urls.put(java.security.cert.CertificateException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateException.html"));
		urls.put(java.security.cert.CertificateExpiredException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateExpiredException.html"));
		urls.put(java.security.cert.CertificateNotYetValidException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateNotYetValidException.html"));
		urls.put(java.security.cert.CertificateParsingException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateParsingException.html"));
		urls.put(java.security.cert.CertificateRevokedException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/cert/CertificateRevokedException.html"));
		urls.put(java.security.spec.InvalidKeySpecException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/spec/InvalidKeySpecException.html"));
		urls.put(java.security.spec.InvalidParameterSpecException.class,
				JAVA11_DOMAIN.concat("java.base/java/security/spec/InvalidParameterSpecException.html"));
		urls.put(java.text.ParseException.class, JAVA11_DOMAIN.concat("java.base/java/text/ParseException.html"));
		urls.put(java.time.DateTimeException.class, JAVA11_DOMAIN.concat("java.base/java/time/DateTimeException.html"));
		urls.put(java.time.format.DateTimeParseException.class,
				JAVA11_DOMAIN.concat("java.base/java/time/format/DateTimeParseException.html"));
		urls.put(java.time.temporal.UnsupportedTemporalTypeException.class,
				JAVA11_DOMAIN.concat("java.base/java/time/temporal/UnsupportedTemporalTypeException.html"));
		urls.put(java.time.zone.ZoneRulesException.class,
				JAVA11_DOMAIN.concat("java.base/java/time/zone/ZoneRulesException.html"));
		urls.put(java.util.ConcurrentModificationException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/ConcurrentModificationException.html"));
		urls.put(java.util.DuplicateFormatFlagsException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/DuplicateFormatFlagsException.html"));
		urls.put(java.util.EmptyStackException.class, JAVA11_DOMAIN.concat("java.base/java/util/EmptyStackException.html"));
		urls.put(java.util.FormatFlagsConversionMismatchException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/FormatFlagsConversionMismatchException.html"));
		urls.put(java.util.FormatterClosedException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/FormatterClosedException.html"));
		urls.put(java.util.IllegalFormatCodePointException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatCodePointException.html"));
		urls.put(java.util.IllegalFormatConversionException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatConversionException.html"));
		urls.put(java.util.IllegalFormatException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatException.html"));
		urls.put(java.util.IllegalFormatFlagsException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatFlagsException.html"));
		urls.put(java.util.IllegalFormatPrecisionException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatPrecisionException.html"));
		urls.put(java.util.IllegalFormatWidthException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/IllegalFormatWidthException.html"));
		urls.put(java.util.IllformedLocaleException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/IllformedLocaleException.html"));
		urls.put(java.util.InputMismatchException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/InputMismatchException.html"));
		urls.put(java.util.InvalidPropertiesFormatException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/InvalidPropertiesFormatException.html"));
		urls.put(java.util.MissingFormatArgumentException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/MissingFormatArgumentException.html"));
		urls.put(java.util.MissingFormatWidthException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/MissingFormatWidthException.html"));
		urls.put(java.util.MissingResourceException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/MissingResourceException.html"));
		urls.put(java.util.NoSuchElementException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/NoSuchElementException.html"));
		urls.put(java.util.TooManyListenersException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/TooManyListenersException.html"));
		urls.put(java.util.UnknownFormatConversionException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/UnknownFormatConversionException.html"));
		urls.put(java.util.UnknownFormatFlagsException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/UnknownFormatFlagsException.html"));
		urls.put(java.util.concurrent.BrokenBarrierException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/BrokenBarrierException.html"));
		urls.put(java.util.concurrent.CancellationException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/CancellationException.html"));
		urls.put(java.util.concurrent.CompletionException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/CompletionException.html"));
		urls.put(java.util.concurrent.ExecutionException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/ExecutionException.html"));
		urls.put(java.util.concurrent.RejectedExecutionException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/RejectedExecutionException.html"));
		urls.put(java.util.concurrent.TimeoutException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/concurrent/TimeoutException.html"));
		urls.put(java.util.jar.JarException.class, JAVA11_DOMAIN.concat("java.base/java/util/jar/JarException.html"));
		urls.put(java.util.regex.PatternSyntaxException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/regex/PatternSyntaxException.html"));
		urls.put(java.util.zip.DataFormatException.class,
				JAVA11_DOMAIN.concat("java.base/java/util/zip/DataFormatException.html"));
		urls.put(java.util.zip.ZipException.class, JAVA11_DOMAIN.concat("java.base/java/util/zip/ZipException.html"));
		urls.put(javax.crypto.AEADBadTagException.class,
				JAVA11_DOMAIN.concat("java.base/javax/crypto/AEADBadTagException.html"));
		urls.put(javax.crypto.BadPaddingException.class,
				JAVA11_DOMAIN.concat("java.base/javax/crypto/BadPaddingException.html"));
		urls.put(javax.crypto.ExemptionMechanismException.class,
				JAVA11_DOMAIN.concat("java.base/javax/crypto/ExemptionMechanismException.html"));
		urls.put(javax.crypto.IllegalBlockSizeException.class,
				JAVA11_DOMAIN.concat("java.base/javax/crypto/IllegalBlockSizeException.html"));
		urls.put(javax.crypto.NoSuchPaddingException.class,
				JAVA11_DOMAIN.concat("java.base/javax/crypto/NoSuchPaddingException.html"));
		urls.put(javax.crypto.ShortBufferException.class,
				JAVA11_DOMAIN.concat("java.base/javax/crypto/ShortBufferException.html"));
		urls.put(javax.net.ssl.SSLException.class, JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLException.html"));
		urls.put(javax.net.ssl.SSLHandshakeException.class,
				JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLHandshakeException.html"));
		urls.put(javax.net.ssl.SSLKeyException.class, JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLKeyException.html"));
		urls.put(javax.net.ssl.SSLPeerUnverifiedException.class,
				JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLPeerUnverifiedException.html"));
		urls.put(javax.net.ssl.SSLProtocolException.class,
				JAVA11_DOMAIN.concat("java.base/javax/net/ssl/SSLProtocolException.html"));
		urls.put(javax.security.auth.DestroyFailedException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/DestroyFailedException.html"));
		urls.put(javax.security.auth.RefreshFailedException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/RefreshFailedException.html"));
		urls.put(javax.security.auth.callback.UnsupportedCallbackException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/callback/UnsupportedCallbackException.html"));
		urls.put(javax.security.auth.login.AccountException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/AccountException.html"));
		urls.put(javax.security.auth.login.AccountExpiredException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/AccountExpiredException.html"));
		urls.put(javax.security.auth.login.AccountLockedException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/AccountLockedException.html"));
		urls.put(javax.security.auth.login.AccountNotFoundException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/AccountNotFoundException.html"));
		urls.put(javax.security.auth.login.CredentialException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/CredentialException.html"));
		urls.put(javax.security.auth.login.CredentialExpiredException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/CredentialExpiredException.html"));
		urls.put(javax.security.auth.login.CredentialNotFoundException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/CredentialNotFoundException.html"));
		urls.put(javax.security.auth.login.FailedLoginException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/FailedLoginException.html"));
		urls.put(javax.security.auth.login.LoginException.class,
				JAVA11_DOMAIN.concat("java.base/javax/security/auth/login/LoginException.html"));
//					exceptionUrls.put(javax.security.cert.CertificateEncodingException.class, DOMAIN.concat("java.base/javax/security/cert/CertificateEncodingException.html"));
//					exceptionUrls.put(javax.security.cert.CertificateException.class, DOMAIN.concat("java.base/javax/security/cert/CertificateException.html"));
//					exceptionUrls.put(javax.security.cert.CertificateExpiredException.class, DOMAIN.concat("java.base/javax/security/cert/CertificateExpiredException.html"));
//					exceptionUrls.put(javax.security.cert.CertificateNotYetValidException.class, DOMAIN.concat("java.base/javax/security/cert/CertificateNotYetValidException.html"));
//					exceptionUrls.put(javax.security.cert.CertificateParsingException.class, DOMAIN.concat("java.base/javax/security/cert/CertificateParsingException.html"));
		urls.put(javax.annotation.processing.FilerException.class,
				JAVA11_DOMAIN.concat("java.compiler/javax/annotation/processing/FilerException.html"));
		urls.put(javax.lang.model.UnknownEntityException.class,
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/UnknownEntityException.html"));
		urls.put(javax.lang.model.element.UnknownAnnotationValueException.class,
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/element/UnknownAnnotationValueException.html"));
		urls.put(javax.lang.model.element.UnknownDirectiveException.class,
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/element/UnknownDirectiveException.html"));
		urls.put(javax.lang.model.element.UnknownElementException.class,
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/element/UnknownElementException.html"));
		urls.put(javax.lang.model.type.MirroredTypeException.class,
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/type/MirroredTypeException.html"));
		urls.put(javax.lang.model.type.MirroredTypesException.class,
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/type/MirroredTypesException.html"));
		urls.put(javax.lang.model.type.UnknownTypeException.class,
				JAVA11_DOMAIN.concat("java.compiler/javax/lang/model/type/UnknownTypeException.html"));
		urls.put(java.awt.datatransfer.MimeTypeParseException.class,
				JAVA11_DOMAIN.concat("java.datatransfer/java/awt/datatransfer/MimeTypeParseException.html"));
		urls.put(java.awt.datatransfer.UnsupportedFlavorException.class,
				JAVA11_DOMAIN.concat("java.datatransfer/java/awt/datatransfer/UnsupportedFlavorException.html"));
		urls.put(java.awt.AWTException.class, JAVA11_DOMAIN.concat("java.desktop/java/awt/AWTException.html"));
		urls.put(java.awt.FontFormatException.class, JAVA11_DOMAIN.concat("java.desktop/java/awt/FontFormatException.html"));
		urls.put(java.awt.HeadlessException.class, JAVA11_DOMAIN.concat("java.desktop/java/awt/HeadlessException.html"));
		urls.put(java.awt.IllegalComponentStateException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/IllegalComponentStateException.html"));
		urls.put(java.awt.color.CMMException.class, JAVA11_DOMAIN.concat("java.desktop/java/awt/color/CMMException.html"));
		urls.put(java.awt.color.ProfileDataException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/color/ProfileDataException.html"));
		urls.put(java.awt.dnd.InvalidDnDOperationException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/dnd/InvalidDnDOperationException.html"));
		urls.put(java.awt.geom.IllegalPathStateException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/geom/IllegalPathStateException.html"));
		urls.put(java.awt.geom.NoninvertibleTransformException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/geom/NoninvertibleTransformException.html"));
		urls.put(java.awt.image.ImagingOpException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/image/ImagingOpException.html"));
		urls.put(java.awt.image.RasterFormatException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/image/RasterFormatException.html"));
		urls.put(java.awt.print.PrinterAbortException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/print/PrinterAbortException.html"));
		urls.put(java.awt.print.PrinterException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/print/PrinterException.html"));
		urls.put(java.awt.print.PrinterIOException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/awt/print/PrinterIOException.html"));
//					exceptionUrls.put(java.beans.ExceptionListener.class, DOMAIN.concat("java.desktop/java/beans/ExceptionListener.html"));
		urls.put(java.beans.IntrospectionException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/beans/IntrospectionException.html"));
		urls.put(java.beans.PropertyVetoException.class,
				JAVA11_DOMAIN.concat("java.desktop/java/beans/PropertyVetoException.html"));
		urls.put(javax.imageio.IIOException.class, JAVA11_DOMAIN.concat("java.desktop/javax/imageio/IIOException.html"));
		urls.put(javax.imageio.metadata.IIOInvalidTreeException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/imageio/metadata/IIOInvalidTreeException.html"));
//					exceptionUrls.put(javax.print.AttributeException.class, DOMAIN.concat("java.desktop/javax/print/AttributeException.html"));
//					exceptionUrls.put(javax.print.FlavorException.class, DOMAIN.concat("java.desktop/javax/print/FlavorException.html"));
		urls.put(javax.print.PrintException.class, JAVA11_DOMAIN.concat("java.desktop/javax/print/PrintException.html"));
//					exceptionUrls.put(javax.print.URIException.class, DOMAIN.concat("java.desktop/javax/print/URIException.html"));
		urls.put(javax.print.attribute.UnmodifiableSetException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/print/attribute/UnmodifiableSetException.html"));
		urls.put(javax.sound.midi.InvalidMidiDataException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/sound/midi/InvalidMidiDataException.html"));
		urls.put(javax.sound.midi.MidiUnavailableException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/sound/midi/MidiUnavailableException.html"));
		urls.put(javax.sound.sampled.LineUnavailableException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/sound/sampled/LineUnavailableException.html"));
		urls.put(javax.sound.sampled.UnsupportedAudioFileException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/sound/sampled/UnsupportedAudioFileException.html"));
		urls.put(javax.swing.UnsupportedLookAndFeelException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/UnsupportedLookAndFeelException.html"));
		urls.put(javax.swing.text.BadLocationException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/text/BadLocationException.html"));
		urls.put(javax.swing.text.ChangedCharSetException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/text/ChangedCharSetException.html"));
		urls.put(javax.swing.tree.ExpandVetoException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/tree/ExpandVetoException.html"));
		urls.put(javax.swing.undo.CannotRedoException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/undo/CannotRedoException.html"));
		urls.put(javax.swing.undo.CannotUndoException.class,
				JAVA11_DOMAIN.concat("java.desktop/javax/swing/undo/CannotUndoException.html"));
		urls.put(java.lang.instrument.IllegalClassFormatException.class,
				JAVA11_DOMAIN.concat("java.instrument/java/lang/instrument/IllegalClassFormatException.html"));
		urls.put(java.lang.instrument.UnmodifiableClassException.class,
				JAVA11_DOMAIN.concat("java.instrument/java/lang/instrument/UnmodifiableClassException.html"));
		urls.put(java.lang.instrument.UnmodifiableModuleException.class,
				JAVA11_DOMAIN.concat("java.instrument/java/lang/instrument/UnmodifiableModuleException.html"));
		urls.put(javax.management.AttributeNotFoundException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/AttributeNotFoundException.html"));
		urls.put(javax.management.BadAttributeValueExpException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/BadAttributeValueExpException.html"));
		urls.put(javax.management.BadBinaryOpValueExpException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/BadBinaryOpValueExpException.html"));
		urls.put(javax.management.BadStringOperationException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/BadStringOperationException.html"));
		urls.put(javax.management.InstanceAlreadyExistsException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/InstanceAlreadyExistsException.html"));
		urls.put(javax.management.InstanceNotFoundException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/InstanceNotFoundException.html"));
		urls.put(javax.management.IntrospectionException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/IntrospectionException.html"));
		urls.put(javax.management.InvalidApplicationException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/InvalidApplicationException.html"));
		urls.put(javax.management.InvalidAttributeValueException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/InvalidAttributeValueException.html"));
		urls.put(javax.management.JMException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/JMException.html"));
		urls.put(javax.management.JMRuntimeException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/JMRuntimeException.html"));
		urls.put(javax.management.ListenerNotFoundException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/ListenerNotFoundException.html"));
		urls.put(javax.management.MBeanException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/MBeanException.html"));
		urls.put(javax.management.MBeanRegistrationException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/MBeanRegistrationException.html"));
		urls.put(javax.management.MalformedObjectNameException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/MalformedObjectNameException.html"));
		urls.put(javax.management.NotCompliantMBeanException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/NotCompliantMBeanException.html"));
		urls.put(javax.management.OperationsException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/OperationsException.html"));
		urls.put(javax.management.ReflectionException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/ReflectionException.html"));
		urls.put(javax.management.RuntimeErrorException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/RuntimeErrorException.html"));
		urls.put(javax.management.RuntimeMBeanException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/RuntimeMBeanException.html"));
		urls.put(javax.management.RuntimeOperationsException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/RuntimeOperationsException.html"));
		urls.put(javax.management.ServiceNotFoundException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/ServiceNotFoundException.html"));
		urls.put(javax.management.modelmbean.InvalidTargetObjectTypeException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/modelmbean/InvalidTargetObjectTypeException.html"));
		urls.put(javax.management.modelmbean.XMLParseException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/modelmbean/XMLParseException.html"));
		urls.put(javax.management.monitor.MonitorSettingException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/monitor/MonitorSettingException.html"));
		urls.put(javax.management.openmbean.InvalidKeyException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/openmbean/InvalidKeyException.html"));
		urls.put(javax.management.openmbean.InvalidOpenTypeException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/openmbean/InvalidOpenTypeException.html"));
		urls.put(javax.management.openmbean.KeyAlreadyExistsException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/openmbean/KeyAlreadyExistsException.html"));
		urls.put(javax.management.openmbean.OpenDataException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/openmbean/OpenDataException.html"));
		urls.put(javax.management.relation.InvalidRelationIdException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRelationIdException.html"));
		urls.put(javax.management.relation.InvalidRelationServiceException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRelationServiceException.html"));
		urls.put(javax.management.relation.InvalidRelationTypeException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRelationTypeException.html"));
		urls.put(javax.management.relation.InvalidRoleInfoException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRoleInfoException.html"));
		urls.put(javax.management.relation.InvalidRoleValueException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/InvalidRoleValueException.html"));
		urls.put(javax.management.relation.RelationException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RelationException.html"));
		urls.put(javax.management.relation.RelationNotFoundException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RelationNotFoundException.html"));
		urls.put(javax.management.relation.RelationServiceNotRegisteredException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RelationServiceNotRegisteredException.html"));
		urls.put(javax.management.relation.RelationTypeNotFoundException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RelationTypeNotFoundException.html"));
		urls.put(javax.management.relation.RoleInfoNotFoundException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RoleInfoNotFoundException.html"));
		urls.put(javax.management.relation.RoleNotFoundException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/relation/RoleNotFoundException.html"));
		urls.put(javax.management.remote.JMXProviderException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/remote/JMXProviderException.html"));
		urls.put(javax.management.remote.JMXServerErrorException.class,
				JAVA11_DOMAIN.concat("java.management/javax/management/remote/JMXServerErrorException.html"));
		urls.put(javax.naming.AuthenticationException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/AuthenticationException.html"));
		urls.put(javax.naming.AuthenticationNotSupportedException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/AuthenticationNotSupportedException.html"));
		urls.put(javax.naming.CannotProceedException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/CannotProceedException.html"));
		urls.put(javax.naming.CommunicationException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/CommunicationException.html"));
		urls.put(javax.naming.ConfigurationException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ConfigurationException.html"));
		urls.put(javax.naming.ContextNotEmptyException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ContextNotEmptyException.html"));
		urls.put(javax.naming.InsufficientResourcesException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/InsufficientResourcesException.html"));
		urls.put(javax.naming.InterruptedNamingException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/InterruptedNamingException.html"));
		urls.put(javax.naming.InvalidNameException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/InvalidNameException.html"));
		urls.put(javax.naming.LimitExceededException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/LimitExceededException.html"));
		urls.put(javax.naming.LinkException.class, JAVA11_DOMAIN.concat("java.naming/javax/naming/LinkException.html"));
		urls.put(javax.naming.LinkLoopException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/LinkLoopException.html"));
		urls.put(javax.naming.MalformedLinkException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/MalformedLinkException.html"));
		urls.put(javax.naming.NameAlreadyBoundException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NameAlreadyBoundException.html"));
		urls.put(javax.naming.NameNotFoundException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NameNotFoundException.html"));
		urls.put(javax.naming.NamingException.class, JAVA11_DOMAIN.concat("java.naming/javax/naming/NamingException.html"));
		urls.put(javax.naming.NamingSecurityException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NamingSecurityException.html"));
		urls.put(javax.naming.NoInitialContextException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NoInitialContextException.html"));
		urls.put(javax.naming.NoPermissionException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NoPermissionException.html"));
		urls.put(javax.naming.NotContextException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/NotContextException.html"));
		urls.put(javax.naming.OperationNotSupportedException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/OperationNotSupportedException.html"));
		urls.put(javax.naming.PartialResultException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/PartialResultException.html"));
		urls.put(javax.naming.ReferralException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ReferralException.html"));
		urls.put(javax.naming.ServiceUnavailableException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ServiceUnavailableException.html"));
		urls.put(javax.naming.SizeLimitExceededException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/SizeLimitExceededException.html"));
		urls.put(javax.naming.TimeLimitExceededException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/TimeLimitExceededException.html"));
		urls.put(javax.naming.directory.AttributeInUseException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/AttributeInUseException.html"));
		urls.put(javax.naming.directory.AttributeModificationException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/AttributeModificationException.html"));
		urls.put(javax.naming.directory.InvalidAttributeIdentifierException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidAttributeIdentifierException.html"));
		urls.put(javax.naming.directory.InvalidAttributeValueException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidAttributeValueException.html"));
		urls.put(javax.naming.directory.InvalidAttributesException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidAttributesException.html"));
		urls.put(javax.naming.directory.InvalidSearchControlsException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidSearchControlsException.html"));
		urls.put(javax.naming.directory.InvalidSearchFilterException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/InvalidSearchFilterException.html"));
		urls.put(javax.naming.directory.NoSuchAttributeException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/NoSuchAttributeException.html"));
		urls.put(javax.naming.directory.SchemaViolationException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/directory/SchemaViolationException.html"));
//					exceptionUrls.put(javax.naming.event.NamingExceptionEvent.class, DOMAIN.concat("java.naming/javax/naming/event/NamingExceptionEvent.html"));
		urls.put(javax.naming.ldap.LdapReferralException.class,
				JAVA11_DOMAIN.concat("java.naming/javax/naming/ldap/LdapReferralException.html"));
		urls.put(java.net.http.HttpConnectTimeoutException.class,
				JAVA11_DOMAIN.concat("java.net.http/java/net/http/HttpConnectTimeoutException.html"));
		urls.put(java.net.http.HttpTimeoutException.class,
				JAVA11_DOMAIN.concat("java.net.http/java/net/http/HttpTimeoutException.html"));
		urls.put(java.net.http.WebSocketHandshakeException.class,
				JAVA11_DOMAIN.concat("java.net.http/java/net/http/WebSocketHandshakeException.html"));
		urls.put(java.util.prefs.BackingStoreException.class,
				JAVA11_DOMAIN.concat("java.prefs/java/util/prefs/BackingStoreException.html"));
		urls.put(java.util.prefs.InvalidPreferencesFormatException.class,
				JAVA11_DOMAIN.concat("java.prefs/java/util/prefs/InvalidPreferencesFormatException.html"));
		urls.put(java.rmi.AccessException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/AccessException.html"));
		urls.put(java.rmi.AlreadyBoundException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/AlreadyBoundException.html"));
		urls.put(java.rmi.ConnectException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/ConnectException.html"));
		urls.put(java.rmi.ConnectIOException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/ConnectIOException.html"));
		urls.put(java.rmi.MarshalException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/MarshalException.html"));
		urls.put(java.rmi.NoSuchObjectException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/NoSuchObjectException.html"));
		urls.put(java.rmi.NotBoundException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/NotBoundException.html"));
//					exceptionUrls.put(java.rmi.RMISecurityException.class, DOMAIN.concat("java.rmi/java/rmi/RMISecurityException.html"));
		urls.put(java.rmi.RemoteException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/RemoteException.html"));
		urls.put(java.rmi.ServerException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/ServerException.html"));
//					exceptionUrls.put(java.rmi.ServerRuntimeException.class, DOMAIN.concat("java.rmi/java/rmi/ServerRuntimeException.html"));
		urls.put(java.rmi.StubNotFoundException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/StubNotFoundException.html"));
		urls.put(java.rmi.UnexpectedException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/UnexpectedException.html"));
		urls.put(java.rmi.UnknownHostException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/UnknownHostException.html"));
		urls.put(java.rmi.UnmarshalException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/UnmarshalException.html"));
		urls.put(java.rmi.server.ExportException.class, JAVA11_DOMAIN.concat("java.rmi/java/rmi/server/ExportException.html"));
		urls.put(java.rmi.server.ServerCloneException.class,
				JAVA11_DOMAIN.concat("java.rmi/java/rmi/server/ServerCloneException.html"));
		urls.put(java.rmi.server.ServerNotActiveException.class,
				JAVA11_DOMAIN.concat("java.rmi/java/rmi/server/ServerNotActiveException.html"));
//					exceptionUrls.put(java.rmi.server.SkeletonMismatchException.class, DOMAIN.concat("java.rmi/java/rmi/server/SkeletonMismatchException.html"));
//					exceptionUrls.put(java.rmi.server.SkeletonNotFoundException.class, DOMAIN.concat("java.rmi/java/rmi/server/SkeletonNotFoundException.html"));
//					exceptionUrls.put(java.rmi.server.SocketSecurityException.class, DOMAIN.concat("java.rmi/java/rmi/server/SocketSecurityException.html"));
		urls.put(javax.script.ScriptException.class, JAVA11_DOMAIN.concat("java.scripting/javax/script/ScriptException.html"));
		urls.put(org.ietf.jgss.GSSException.class, JAVA11_DOMAIN.concat("java.security.jgss/org/ietf/jgss/GSSException.html"));
		urls.put(javax.security.sasl.AuthenticationException.class,
				JAVA11_DOMAIN.concat("java.security.sasl/javax/security/sasl/AuthenticationException.html"));
		urls.put(javax.security.sasl.SaslException.class,
				JAVA11_DOMAIN.concat("java.security.sasl/javax/security/sasl/SaslException.html"));
//					exceptionUrls.put(javax.smartcardio.CardException.class, DOMAIN.concat("java.smartcardio/javax/smartcardio/CardException.html"));
//					exceptionUrls.put(javax.smartcardio.CardNotPresentException.class, DOMAIN.concat("java.smartcardio/javax/smartcardio/CardNotPresentException.html"));
		urls.put(javax.sql.rowset.serial.SerialException.class,
				JAVA11_DOMAIN.concat("java.sql.rowset/javax/sql/rowset/serial/SerialException.html"));
		urls.put(javax.sql.rowset.spi.SyncFactoryException.class,
				JAVA11_DOMAIN.concat("java.sql.rowset/javax/sql/rowset/spi/SyncFactoryException.html"));
		urls.put(javax.sql.rowset.spi.SyncProviderException.class,
				JAVA11_DOMAIN.concat("java.sql.rowset/javax/sql/rowset/spi/SyncProviderException.html"));
		urls.put(java.sql.BatchUpdateException.class, JAVA11_DOMAIN.concat("java.sql/java/sql/BatchUpdateException.html"));
		urls.put(java.sql.SQLClientInfoException.class, JAVA11_DOMAIN.concat("java.sql/java/sql/SQLClientInfoException.html"));
		urls.put(java.sql.SQLDataException.class, JAVA11_DOMAIN.concat("java.sql/java/sql/SQLDataException.html"));
		urls.put(java.sql.SQLException.class, JAVA11_DOMAIN.concat("java.sql/java/sql/SQLException.html"));
		urls.put(java.sql.SQLFeatureNotSupportedException.class,
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLFeatureNotSupportedException.html"));
		urls.put(java.sql.SQLIntegrityConstraintViolationException.class,
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLIntegrityConstraintViolationException.html"));
		urls.put(java.sql.SQLInvalidAuthorizationSpecException.class,
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLInvalidAuthorizationSpecException.html"));
		urls.put(java.sql.SQLNonTransientConnectionException.class,
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLNonTransientConnectionException.html"));
		urls.put(java.sql.SQLNonTransientException.class,
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLNonTransientException.html"));
		urls.put(java.sql.SQLRecoverableException.class,
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLRecoverableException.html"));
		urls.put(java.sql.SQLSyntaxErrorException.class,
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLSyntaxErrorException.html"));
		urls.put(java.sql.SQLTimeoutException.class, JAVA11_DOMAIN.concat("java.sql/java/sql/SQLTimeoutException.html"));
		urls.put(java.sql.SQLTransactionRollbackException.class,
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLTransactionRollbackException.html"));
		urls.put(java.sql.SQLTransientConnectionException.class,
				JAVA11_DOMAIN.concat("java.sql/java/sql/SQLTransientConnectionException.html"));
		urls.put(java.sql.SQLTransientException.class, JAVA11_DOMAIN.concat("java.sql/java/sql/SQLTransientException.html"));
//		urls.put(javax.transaction.xa.XAException.class, DOMAIN.concat("java.transaction.xa/javax/transaction/xa/XAException.html"));
		urls.put(javax.xml.crypto.KeySelectorException.class,
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/KeySelectorException.html"));
		urls.put(javax.xml.crypto.MarshalException.class,
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/MarshalException.html"));
		urls.put(javax.xml.crypto.NoSuchMechanismException.class,
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/NoSuchMechanismException.html"));
		urls.put(javax.xml.crypto.URIReferenceException.class,
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/URIReferenceException.html"));
		urls.put(javax.xml.crypto.dsig.TransformException.class,
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/dsig/TransformException.html"));
		urls.put(javax.xml.crypto.dsig.XMLSignatureException.class,
				JAVA11_DOMAIN.concat("java.xml.crypto/javax/xml/crypto/dsig/XMLSignatureException.html"));
		urls.put(javax.xml.catalog.CatalogException.class,
				JAVA11_DOMAIN.concat("java.xml/javax/xml/catalog/CatalogException.html"));
		urls.put(javax.xml.datatype.DatatypeConfigurationException.class,
				JAVA11_DOMAIN.concat("java.xml/javax/xml/datatype/DatatypeConfigurationException.html"));
		urls.put(javax.xml.parsers.ParserConfigurationException.class,
				JAVA11_DOMAIN.concat("java.xml/javax/xml/parsers/ParserConfigurationException.html"));
		urls.put(javax.xml.stream.XMLStreamException.class,
				JAVA11_DOMAIN.concat("java.xml/javax/xml/stream/XMLStreamException.html"));
		urls.put(javax.xml.transform.TransformerConfigurationException.class,
				JAVA11_DOMAIN.concat("java.xml/javax/xml/transform/TransformerConfigurationException.html"));
		urls.put(javax.xml.transform.TransformerException.class,
				JAVA11_DOMAIN.concat("java.xml/javax/xml/transform/TransformerException.html"));
		urls.put(javax.xml.xpath.XPathException.class, JAVA11_DOMAIN.concat("java.xml/javax/xml/xpath/XPathException.html"));
		urls.put(javax.xml.xpath.XPathExpressionException.class,
				JAVA11_DOMAIN.concat("java.xml/javax/xml/xpath/XPathExpressionException.html"));
		urls.put(javax.xml.xpath.XPathFactoryConfigurationException.class,
				JAVA11_DOMAIN.concat("java.xml/javax/xml/xpath/XPathFactoryConfigurationException.html"));
		urls.put(javax.xml.xpath.XPathFunctionException.class,
				JAVA11_DOMAIN.concat("java.xml/javax/xml/xpath/XPathFunctionException.html"));
		urls.put(org.w3c.dom.DOMException.class, JAVA11_DOMAIN.concat("java.xml/org/w3c/dom/DOMException.html"));
		urls.put(org.w3c.dom.events.EventException.class,
				JAVA11_DOMAIN.concat("java.xml/org/w3c/dom/events/EventException.html"));
		urls.put(org.w3c.dom.ls.LSException.class, JAVA11_DOMAIN.concat("java.xml/org/w3c/dom/ls/LSException.html"));
		urls.put(org.w3c.dom.ranges.RangeException.class,
				JAVA11_DOMAIN.concat("java.xml/org/w3c/dom/ranges/RangeException.html"));
		urls.put(org.xml.sax.SAXException.class, JAVA11_DOMAIN.concat("java.xml/org/xml/sax/SAXException.html"));
		urls.put(org.xml.sax.SAXNotRecognizedException.class,
				JAVA11_DOMAIN.concat("java.xml/org/xml/sax/SAXNotRecognizedException.html"));
		urls.put(org.xml.sax.SAXNotSupportedException.class,
				JAVA11_DOMAIN.concat("java.xml/org/xml/sax/SAXNotSupportedException.html"));
		urls.put(org.xml.sax.SAXParseException.class, JAVA11_DOMAIN.concat("java.xml/org/xml/sax/SAXParseException.html"));
		
		urls.putAll(fillAEMHash());
		return urls;
	}

	/**
	 * fillAEMHash
	 * @return hashMap with AEM urls api docs
	 */
	private static final HashMap<Class<? extends Throwable>, String> fillAEMHash() {
		HashMap<Class<? extends Throwable>, String> urls = new HashMap<>();
		
		urls.put(com.adobe.aem.formsndocuments.exception.FormsNDocumentsException.class,
				AEM_DOMAIN.concat("com/adobe/aem/formsndocuments/exception/FormsNDocumentsException.html"));
		urls.put(com.adobe.aem.transaction.core.exception.TransactionException.class,
				AEM_DOMAIN.concat("com/adobe/aem/transaction/core/exception/TransactionException.html"));
		urls.put(com.adobe.aemds.guide.common.FormsGuideException.class,
				AEM_DOMAIN.concat("com/adobe/aemds/guide/common/FormsGuideException.html"));
		urls.put(com.adobe.aemds.guide.service.GuideException.class,
				AEM_DOMAIN.concat("com/adobe/aemds/guide/service/GuideException.html"));
		urls.put(com.adobe.aemforms.fm.exception.FormsMgrException.class,
				AEM_DOMAIN.concat("com/adobe/aemforms/fm/exception/FormsMgrException.html"));
		
		urls.put(com.adobe.cq.adobeims.imsprofile.ImsProfileException.class,
				AEM_DOMAIN.concat("com/adobe/cq/adobeims/imsprofile/ImsProfileException.html"));
		urls.put(com.adobe.cq.adobeims.imsprofile.InvalidImsConfigException.class,
				AEM_DOMAIN.concat("com/adobe/cq/adobeims/imsprofile/InvalidImsConfigException.html"));
		urls.put(com.adobe.cq.cloudservices.provisioning.ProvisioningException.class,
				AEM_DOMAIN.concat("com/adobe/cq/cloudservices/provisioning/ProvisioningException.html"));
		urls.put(com.adobe.cq.commerce.api.CommerceException.class,
				AEM_DOMAIN.concat("com/adobe/cq/commerce/api/CommerceException.html"));
		urls.put(com.adobe.cq.commerce.api.NotAuthorizedException.class,
				AEM_DOMAIN.concat("com/adobe/cq/commerce/api/NotAuthorizedException.html"));
		urls.put(com.adobe.cq.dam.cfm.ContentFragmentException.class,
				AEM_DOMAIN.concat("com/adobe/cq/dam/cfm/ContentFragmentException.html"));
		urls.put(com.adobe.cq.dashboards.DashboardException.class,
				AEM_DOMAIN.concat("com/adobe/cq/dashboards/DashboardException.html"));
		urls.put(com.adobe.cq.inbox.api.InboxException.class,
				AEM_DOMAIN.concat("com/adobe/cq/inbox/api/InboxException.html"));
		urls.put(com.adobe.cq.launches.api.LaunchException.class,
				AEM_DOMAIN.concat("com/adobe/cq/launches/api/LaunchException.html"));
		urls.put(com.adobe.cq.mcm.campaign.NewsletterException.class,
				AEM_DOMAIN.concat("com/adobe/cq/mcm/campaign/NewsletterException.html"));
		urls.put(com.adobe.cq.mcm.campaign.NewsletterReplicationException.class,
				AEM_DOMAIN.concat("com/adobe/cq/mcm/campaign/NewsletterReplicationException.html"));
		urls.put(com.adobe.cq.projects.api.ProjectException.class,
				AEM_DOMAIN.concat("com/adobe/cq/projects/api/ProjectException.html"));
		urls.put(com.adobe.cq.remote.content.renderer.RemoteContentRenderingException.class,
				AEM_DOMAIN.concat("com/adobe/cq/remote/content/renderer/RemoteContentRenderingException.html"));
		urls.put(com.adobe.cq.scheduled.exporter.ExportException.class,
				AEM_DOMAIN.concat("com/adobe/cq/scheduled/exporter/ExportException.html"));
		urls.put(com.adobe.cq.scheduled.exporter.TransformationException.class,
				AEM_DOMAIN.concat("com/adobe/cq/scheduled/exporter/TransformationException.html"));
		urls.put(com.adobe.cq.smartcontent.SmartContentException.class,
				AEM_DOMAIN.concat("com/adobe/cq/smartcontent/SmartContentException.html"));
		urls.put(com.adobe.cq.social.SocialException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/SocialException.html"));
		urls.put(com.adobe.cq.social.commons.emailreply.EmailReplyException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/commons/emailreply/EmailReplyException.html"));
		urls.put(com.adobe.cq.social.commons.listing.QueryFilterUtil.QueryFilterException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/commons/listing/QueryFilterUtil.QueryFilterException.html"));
		urls.put(com.adobe.cq.social.group.api.GroupConfigurator.GroupConfigurationException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/group/api/GroupConfigurator.GroupConfigurationException.html"));
		urls.put(com.adobe.cq.social.group.api.GroupException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/group/api/GroupException.html"));
		urls.put(com.adobe.cq.social.messaging.api.MessageBoxOverflowException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/messaging/api/MessageBoxOverflowException.html"));
		urls.put(com.adobe.cq.social.messaging.api.MessageException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/messaging/api/MessageException.html"));
		urls.put(com.adobe.cq.social.messaging.api.MessageSendException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/messaging/api/MessageSendException.html"));
		urls.put(com.adobe.cq.social.notifications.channel.ChannelException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/notifications/channel/ChannelException.html"));
		urls.put(com.adobe.cq.social.review.client.api.ReviewException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/review/client/api/ReviewException.html"));
		urls.put(com.adobe.cq.social.scf.JsonException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/scf/JsonException.html"));
		urls.put(com.adobe.cq.social.scf.OperationException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/scf/OperationException.html"));
		urls.put(com.adobe.cq.social.srp.APIException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/srp/APIException.html"));
		urls.put(com.adobe.cq.social.tally.TallyBadRequestException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/tally/TallyBadRequestException.html"));
		urls.put(com.adobe.cq.social.tally.client.api.TallyException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/tally/client/api/TallyException.html"));
		urls.put(com.adobe.cq.social.ugcbase.moderation.AutoModerationProcessException.class,
				AEM_DOMAIN.concat("com/adobe/cq/social/ugcbase/moderation/AutoModerationProcessException.html"));
		urls.put(com.adobe.cq.targetrecommendations.api.TargetRecommendationsException.class,
				AEM_DOMAIN.concat("com/adobe/cq/targetrecommendations/api/TargetRecommendationsException.html"));
		urls.put(com.adobe.dam.print.ids.IDSException.class,
				AEM_DOMAIN.concat("com/adobe/dam/print/ids/IDSException.html"));
		urls.put(com.adobe.fd.fp.exception.FormsPortalException.class,
				AEM_DOMAIN.concat("com/adobe/fd/fp/exception/FormsPortalException.html"));
		urls.put(com.adobe.fd.fp.exception.FormsPortalRepositoryException.class,AEM_DOMAIN.concat("com/adobe/fd/fp/exception/FormsPortalRepositoryException.html"));
		urls.put(com.adobe.forms.common.service.FormsException.class,
				AEM_DOMAIN.concat("com/adobe/forms/common/service/FormsException.html"));
		urls.put(com.adobe.forms.foundation.service.FormsFoundationException.class,
				AEM_DOMAIN.concat("com/adobe/forms/foundation/service/FormsFoundationException.html"));
		urls.put(com.adobe.granite.activitystreams.ActivityException.class,
				AEM_DOMAIN.concat("com/adobe/granite/activitystreams/ActivityException.html"));
		urls.put(com.adobe.granite.asset.api.AssetException.class,
				AEM_DOMAIN.concat("com/adobe/granite/asset/api/AssetException.html"));
		urls.put(com.adobe.granite.asset.api.AssetIOException.class,
				AEM_DOMAIN.concat("com/adobe/granite/asset/api/AssetIOException.html"));
		urls.put(com.adobe.granite.auth.cert.UserCertificateMappingException.class,
				AEM_DOMAIN.concat("com/adobe/granite/auth/cert/UserCertificateMappingException.html"));
		urls.put(com.adobe.granite.auth.oauth.OAuthIdInUseException.class,
				AEM_DOMAIN.concat("com/adobe/granite/auth/oauth/OAuthIdInUseException.html"));
		urls.put(com.adobe.granite.comments.CommentException.class,
				AEM_DOMAIN.concat("com/adobe/granite/comments/CommentException.html"));
		urls.put(com.adobe.granite.crypto.CryptoException.class,
				AEM_DOMAIN.concat("com/adobe/granite/crypto/CryptoException.html"));
		urls.put(com.adobe.granite.keystore.KeyStoreNotInitialisedException.class,
				AEM_DOMAIN.concat("com/adobe/granite/keystore/KeyStoreNotInitialisedException.html"));
		
		urls.put(com.adobe.granite.omnisearch.api.core.OmniSearchException.class,
				AEM_DOMAIN.concat("com/adobe/granite/omnisearch/api/core/OmniSearchException.html"));
		urls.put(com.adobe.granite.rest.RequestException.class,
				AEM_DOMAIN.concat("com/adobe/granite/rest/RequestException.html"));
		urls.put(com.adobe.granite.rest.RestException.class,
				AEM_DOMAIN.concat("com/adobe/granite/rest/RestException.html"));
		urls.put(com.adobe.granite.rest.converter.ResourceConverterException.class,
				AEM_DOMAIN.concat("com/adobe/granite/rest/converter/ResourceConverterException.html"));
		urls.put(com.adobe.granite.socialgraph.SocialGraphException.class,
				AEM_DOMAIN.concat("com/adobe/granite/socialgraph/SocialGraphException.html"));
		urls.put(com.adobe.granite.taskmanagement.TaskManagerException.class,
				AEM_DOMAIN.concat("com/adobe/granite/taskmanagement/TaskManagerException.html"));
		urls.put(com.adobe.granite.taskmanagement.TaskNotFoundException.class,
				AEM_DOMAIN.concat("com/adobe/granite/taskmanagement/TaskNotFoundException.html"));
		urls.put(com.adobe.granite.taskmanagement.TaskSecurityException.class,
				AEM_DOMAIN.concat("com/adobe/granite/taskmanagement/TaskSecurityException.html"));
		urls.put(com.adobe.granite.translation.api.TranslationException.class,
				AEM_DOMAIN.concat("com/adobe/granite/translation/api/TranslationException.html"));
		urls.put(com.adobe.granite.translation.api.xliff.TranslationXLIFFServiceException.class,
				AEM_DOMAIN.concat("com/adobe/granite/translation/api/xliff/TranslationXLIFFServiceException.html"));
		urls.put(com.adobe.granite.workflow.WorkflowException.class,
				AEM_DOMAIN.concat("com/adobe/granite/workflow/WorkflowException.html"));
		urls.put(com.adobe.granite.workflow.model.ValidationException.class,
				AEM_DOMAIN.concat("com/adobe/granite/workflow/model/ValidationException.html"));
		urls.put(com.adobe.granite.workflow.model.VersionException.class,
				AEM_DOMAIN.concat("com/adobe/granite/workflow/model/VersionException.html"));
		urls.put(com.adobe.internal.xmp.XMPException.class,
				AEM_DOMAIN.concat("com/adobe/internal/xmp/XMPException.html"));
		urls.put(com.adobe.reef.siren.SirenException.class,
				AEM_DOMAIN.concat("com/adobe/reef/siren/SirenException.html"));
		urls.put(com.adobe.reef.siren.builder.BuilderException.class,
				AEM_DOMAIN.concat("com/adobe/reef/siren/builder/BuilderException.html"));
		urls.put(com.adobe.reef.siren.builder.BuilderValidationException.class,
				AEM_DOMAIN.concat("com/adobe/reef/siren/builder/BuilderValidationException.html"));
		urls.put(com.adobe.reef.siren.converter.ConverterException.class,
				AEM_DOMAIN.concat("com/adobe/reef/siren/converter/ConverterException.html"));
		urls.put(com.adobe.versioncue.nativecomm.BadConfigException.class,
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/BadConfigException.html"));
		urls.put(com.adobe.versioncue.nativecomm.NativeCommException.class,
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/NativeCommException.html"));
		urls.put(com.adobe.versioncue.nativecomm.ServiceAbortException.class,
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/ServiceAbortException.html"));
		urls.put(com.adobe.versioncue.nativecomm.ServiceCallException.class,
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/ServiceCallException.html"));
		urls.put(com.adobe.versioncue.nativecomm.ServiceTimeoutException.class,
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/ServiceTimeoutException.html"));
		urls.put(com.adobe.versioncue.nativecomm.msg.BadMessageException.class,
				AEM_DOMAIN.concat("com/adobe/versioncue/nativecomm/msg/BadMessageException.html"));
		urls.put(com.adobe.xmp.XMPException.class, AEM_DOMAIN.concat("com/adobe/xmp/XMPException.html"));
		urls.put(com.adobe.xmp.core.XMPException.class, AEM_DOMAIN.concat("com/adobe/xmp/core/XMPException.html"));
		urls.put(com.adobe.xmp.core.parser.ParseRDFException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/core/parser/ParseRDFException.html"));
		urls.put(com.adobe.xmp.core.parser.ParseXMLException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/core/parser/ParseXMLException.html"));
		urls.put(com.adobe.xmp.core.parser.ParseXMPException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/core/parser/ParseXMPException.html"));
		urls.put(com.adobe.xmp.core.serializer.SerializeOptionsException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/core/serializer/SerializeOptionsException.html"));
		urls.put(com.adobe.xmp.core.serializer.SerializeXMPException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/core/serializer/SerializeXMPException.html"));
		urls.put(com.adobe.xmp.path.XMPPathParserException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/path/XMPPathParserException.html"));
		urls.put(com.adobe.xmp.schema.model.XMPSchemaException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/schema/model/XMPSchemaException.html"));
		urls.put(com.adobe.xmp.schema.rng.parser.exceptions.RNGElementNotSupportedException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/schema/rng/parser/exceptions/RNGElementNotSupportedException.html"));
		urls.put(com.adobe.xmp.schema.rng.parser.exceptions.RNGInvalidSchemaException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/schema/rng/parser/exceptions/RNGInvalidSchemaException.html"));
		urls.put(com.adobe.xmp.schema.rng.parser.exceptions.RNGParseException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/schema/rng/parser/exceptions/RNGParseException.html"));
		urls.put(com.adobe.xmp.schema.rng.parser.exceptions.RNGUnexpectedElementFoundException.class, AEM_DOMAIN
				.concat("com/adobe/xmp/schema/rng/parser/exceptions/RNGUnexpectedElementFoundException.html"));
		urls.put(com.adobe.xmp.schema.service.SchemaServiceException.class,
				AEM_DOMAIN.concat("com/adobe/xmp/schema/service/SchemaServiceException.html"));
		urls.put(com.day.commons.datasource.poolservice.DataSourceNotFoundException.class,
				AEM_DOMAIN.concat("com/day/commons/datasource/poolservice/DataSourceNotFoundException.html"));
		urls.put(com.day.commons.datasource.poolservice.TypeNotAvailableException.class,
				AEM_DOMAIN.concat("com/day/commons/datasource/poolservice/TypeNotAvailableException.html"));
		urls.put(com.day.cq.analytics.sitecatalyst.SitecatalystException.class,
				AEM_DOMAIN.concat("com/day/cq/analytics/sitecatalyst/SitecatalystException.html"));
		urls.put(com.day.cq.analytics.testandtarget.TestandtargetException.class,
				AEM_DOMAIN.concat("com/day/cq/analytics/testandtarget/TestandtargetException.html"));
		urls.put(com.day.cq.analytics.testandtarget.TestandtargetFormattedException.class,
				AEM_DOMAIN.concat("com/day/cq/analytics/testandtarget/TestandtargetFormattedException.html"));
		urls.put(com.day.cq.analytics.testandtarget.TestandtargetUnsupportedApiOperationException.class, AEM_DOMAIN
				.concat("com/day/cq/analytics/testandtarget/TestandtargetUnsupportedApiOperationException.html"));
		urls.put(com.day.cq.analytics.testandtarget.workspaces.WorkspacesConfigurationException.class, AEM_DOMAIN
				.concat("com/day/cq/analytics/testandtarget/workspaces/WorkspacesConfigurationException.html"));
		urls.put(com.day.cq.analytics.testandtarget.workspaces.WorkspacesProviderException.class,
				AEM_DOMAIN.concat("com/day/cq/analytics/testandtarget/workspaces/WorkspacesProviderException.html"));
		urls.put(com.day.cq.commons.SlingRepositoryException.class,
				AEM_DOMAIN.concat("com/day/cq/commons/SlingRepositoryException.html"));
		urls.put(com.day.cq.commons.date.InvalidDateException.class,
				AEM_DOMAIN.concat("com/day/cq/commons/date/InvalidDateException.html"));
		urls.put(com.day.cq.dam.api.AssetHandlerException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/api/AssetHandlerException.html"));
		urls.put(com.day.cq.dam.api.FolderSettingsException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/api/FolderSettingsException.html"));
		urls.put(com.day.cq.dam.api.ProcessorException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/api/ProcessorException.html"));
		urls.put(com.day.cq.dam.commons.watermark.WatermarkingException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/commons/watermark/WatermarkingException.html"));
		urls.put(com.day.cq.dam.handler.ffmpeg.FfmpegNotFoundException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/handler/ffmpeg/FfmpegNotFoundException.html"));
		urls.put(com.day.cq.dam.handler.gibson.fontmanager.FontManagerException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/handler/gibson/fontmanager/FontManagerException.html"));
		urls.put(com.day.cq.dam.indd.PageExtractionException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/indd/PageExtractionException.html"));
		urls.put(com.day.cq.dam.scene7.api.model.AuthenticationException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/scene7/api/model/AuthenticationException.html"));
		urls.put(com.day.cq.dam.scene7.api.model.AuthorizationException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/scene7/api/model/AuthorizationException.html"));
		urls.put(com.day.cq.dam.scene7.api.model.IpsApiException.class,
				AEM_DOMAIN.concat("com/day/cq/dam/scene7/api/model/IpsApiException.html"));
		urls.put(com.day.cq.mailer.MailingException.class,
				AEM_DOMAIN.concat("com/day/cq/mailer/MailingException.html"));
		urls.put(com.day.cq.mcm.campaign.ACConnectorException.class,
				AEM_DOMAIN.concat("com/day/cq/mcm/campaign/ACConnectorException.html"));
		urls.put(com.day.cq.mcm.campaign.CampaignException.class,
				AEM_DOMAIN.concat("com/day/cq/mcm/campaign/CampaignException.html"));
		urls.put(com.day.cq.mcm.campaign.ConfigurationException.class,
				AEM_DOMAIN.concat("com/day/cq/mcm/campaign/ConfigurationException.html"));
		urls.put(com.day.cq.mcm.campaign.ConnectionException.class,
				AEM_DOMAIN.concat("com/day/cq/mcm/campaign/ConnectionException.html"));
		urls.put(com.day.cq.mcm.emailprovider.EmailServiceException.class,
				AEM_DOMAIN.concat("com/day/cq/mcm/emailprovider/EmailServiceException.html"));
		urls.put(com.day.cq.notification.api.ChannelException.class,
				AEM_DOMAIN.concat("com/day/cq/notification/api/ChannelException.html"));
		urls.put(com.day.cq.notification.api.NotificationException.class,
				AEM_DOMAIN.concat("com/day/cq/notification/api/NotificationException.html"));
		urls.put(com.day.cq.polling.importer.ImportException.class,
				AEM_DOMAIN.concat("com/day/cq/polling/importer/ImportException.html"));
		urls.put(com.day.cq.replication.AccessDeniedException.class,
				AEM_DOMAIN.concat("com/day/cq/replication/AccessDeniedException.html"));
		urls.put(com.day.cq.replication.AgentNotFoundException.class,
				AEM_DOMAIN.concat("com/day/cq/replication/AgentNotFoundException.html"));
		urls.put(com.day.cq.replication.PathNotFoundException.class,
				AEM_DOMAIN.concat("com/day/cq/replication/PathNotFoundException.html"));
		urls.put(com.day.cq.replication.ReplicationException.class,
				AEM_DOMAIN.concat("com/day/cq/replication/ReplicationException.html"));
		urls.put(com.day.cq.replication.TransportException.class,
				AEM_DOMAIN.concat("com/day/cq/replication/TransportException.html"));
		urls.put(com.day.cq.replication.UnrecoverableReplicationException.class,
				AEM_DOMAIN.concat("com/day/cq/replication/UnrecoverableReplicationException.html"));
		
		urls.put(com.day.cq.spellchecker.SpellCheckException.class,
				AEM_DOMAIN.concat("com/day/cq/spellchecker/SpellCheckException.html"));
		urls.put(com.day.cq.tagging.InvalidTagFormatException.class,
				AEM_DOMAIN.concat("com/day/cq/tagging/InvalidTagFormatException.html"));
		urls.put(com.day.cq.tagging.TagException.class, AEM_DOMAIN.concat("com/day/cq/tagging/TagException.html"));
		urls.put(com.day.cq.wcm.api.WCMException.class, AEM_DOMAIN.concat("com/day/cq/wcm/api/WCMException.html"));
		urls.put(com.day.cq.wcm.api.WCMRuntimeException.class,
				AEM_DOMAIN.concat("com/day/cq/wcm/api/WCMRuntimeException.html"));
		urls.put(com.day.cq.wcm.command.api.CommandException.class,
				AEM_DOMAIN.concat("com/day/cq/wcm/command/api/CommandException.html"));
		urls.put(com.day.cq.wcm.designimporter.DesignImportException.class,
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/DesignImportException.html"));
		urls.put(com.day.cq.wcm.designimporter.MalformedArchiveException.class,
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/MalformedArchiveException.html"));
		urls.put(com.day.cq.wcm.designimporter.MissingCanvasException.class,
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/MissingCanvasException.html"));
		urls.put(com.day.cq.wcm.designimporter.MissingHTMLException.class,
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/MissingHTMLException.html"));
		urls.put(com.day.cq.wcm.designimporter.UnsupportedTagContentException.class,
				AEM_DOMAIN.concat("com/day/cq/wcm/designimporter/UnsupportedTagContentException.html"));
		urls.put(com.day.cq.wcm.undo.BinaryHandlingException.class,
				AEM_DOMAIN.concat("com/day/cq/wcm/undo/BinaryHandlingException.html"));
		urls.put(com.day.cq.workflow.WorkflowException.class,
				AEM_DOMAIN.concat("com/day/cq/workflow/WorkflowException.html"));
		urls.put(com.day.cq.workflow.model.ValidationException.class,
				AEM_DOMAIN.concat("com/day/cq/workflow/model/ValidationException.html"));
		
		urls.put(com.day.crx.BaseException.class, AEM_DOMAIN.concat("com/day/crx/BaseException.html"));
		urls.put(com.day.util.WrappedException.class, AEM_DOMAIN.concat("com/day/util/WrappedException.html"));
		urls.put(com.day.util.WrappedRuntimeException.class,
				AEM_DOMAIN.concat("com/day/util/WrappedRuntimeException.html"));
		urls.put(com.fasterxml.jackson.core.JsonGenerationException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/JsonGenerationException.html"));
		urls.put(com.fasterxml.jackson.core.JsonParseException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/JsonParseException.html"));
		urls.put(com.fasterxml.jackson.core.JsonProcessingException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/JsonProcessingException.html"));
		urls.put(com.fasterxml.jackson.core.exc.InputCoercionException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/exc/InputCoercionException.html"));
		urls.put(com.fasterxml.jackson.core.exc.StreamReadException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/exc/StreamReadException.html"));
		urls.put(com.fasterxml.jackson.core.io.JsonEOFException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/core/io/JsonEOFException.html"));
		urls.put(com.fasterxml.jackson.databind.JsonMappingException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/JsonMappingException.html"));
		urls.put(com.fasterxml.jackson.databind.RuntimeJsonMappingException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/RuntimeJsonMappingException.html"));
		urls.put(com.fasterxml.jackson.databind.exc.IgnoredPropertyException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/IgnoredPropertyException.html"));
		urls.put(com.fasterxml.jackson.databind.exc.InvalidDefinitionException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/InvalidDefinitionException.html"));
		urls.put(com.fasterxml.jackson.databind.exc.InvalidFormatException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/InvalidFormatException.html"));
		urls.put(com.fasterxml.jackson.databind.exc.InvalidNullException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/InvalidNullException.html"));
		urls.put(com.fasterxml.jackson.databind.exc.InvalidTypeIdException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/InvalidTypeIdException.html"));
		urls.put(com.fasterxml.jackson.databind.exc.MismatchedInputException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/MismatchedInputException.html"));
		urls.put(com.fasterxml.jackson.databind.exc.PropertyBindingException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/PropertyBindingException.html"));
		urls.put(com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/UnrecognizedPropertyException.html"));
		urls.put(com.fasterxml.jackson.databind.exc.ValueInstantiationException.class,
				AEM_DOMAIN.concat("com/fasterxml/jackson/databind/exc/ValueInstantiationException.html"));
		urls.put(com.github.jknack.handlebars.HandlebarsException.class,
				AEM_DOMAIN.concat("com/github/jknack/handlebars/HandlebarsException.html"));
		urls.put(com.google.gson.JsonIOException.class, AEM_DOMAIN.concat("com/google/gson/JsonIOException.html"));
		urls.put(com.google.gson.JsonParseException.class,
				AEM_DOMAIN.concat("com/google/gson/JsonParseException.html"));
		urls.put(com.google.gson.JsonSyntaxException.class,
				AEM_DOMAIN.concat("com/google/gson/JsonSyntaxException.html"));
		urls.put(com.google.gson.stream.MalformedJsonException.class,
				AEM_DOMAIN.concat("com/google/gson/stream/MalformedJsonException.html"));
		
		urls.put(com.sun.mail.iap.BadCommandException.class,
				AEM_DOMAIN.concat("com/sun/mail/iap/BadCommandException.html"));
		urls.put(com.sun.mail.iap.CommandFailedException.class,
				AEM_DOMAIN.concat("com/sun/mail/iap/CommandFailedException.html"));
		urls.put(com.sun.mail.iap.ConnectionException.class,
				AEM_DOMAIN.concat("com/sun/mail/iap/ConnectionException.html"));
		urls.put(com.sun.mail.iap.LiteralException.class, AEM_DOMAIN.concat("com/sun/mail/iap/LiteralException.html"));
		urls.put(com.sun.mail.iap.ParsingException.class, AEM_DOMAIN.concat("com/sun/mail/iap/ParsingException.html"));
		urls.put(com.sun.mail.iap.ProtocolException.class,
				AEM_DOMAIN.concat("com/sun/mail/iap/ProtocolException.html"));
		urls.put(com.sun.mail.imap.ReferralException.class,
				AEM_DOMAIN.concat("com/sun/mail/imap/ReferralException.html"));
		urls.put(com.sun.mail.imap.protocol.IMAPReferralException.class,
				AEM_DOMAIN.concat("com/sun/mail/imap/protocol/IMAPReferralException.html"));
		urls.put(com.sun.mail.smtp.SMTPAddressFailedException.class,
				AEM_DOMAIN.concat("com/sun/mail/smtp/SMTPAddressFailedException.html"));
		urls.put(com.sun.mail.smtp.SMTPAddressSucceededException.class,
				AEM_DOMAIN.concat("com/sun/mail/smtp/SMTPAddressSucceededException.html"));
		urls.put(com.sun.mail.smtp.SMTPSendFailedException.class,
				AEM_DOMAIN.concat("com/sun/mail/smtp/SMTPSendFailedException.html"));
		urls.put(com.sun.mail.smtp.SMTPSenderFailedException.class,
				AEM_DOMAIN.concat("com/sun/mail/smtp/SMTPSenderFailedException.html"));
		urls.put(com.sun.mail.util.DecodingException.class,
				AEM_DOMAIN.concat("com/sun/mail/util/DecodingException.html"));
		urls.put(com.sun.mail.util.FolderClosedIOException.class,
				AEM_DOMAIN.concat("com/sun/mail/util/FolderClosedIOException.html"));
		urls.put(com.sun.mail.util.MailConnectException.class,
				AEM_DOMAIN.concat("com/sun/mail/util/MailConnectException.html"));
		urls.put(com.sun.mail.util.MessageRemovedIOException.class,
				AEM_DOMAIN.concat("com/sun/mail/util/MessageRemovedIOException.html"));
		urls.put(com.sun.mail.util.SocketConnectException.class,
				AEM_DOMAIN.concat("com/sun/mail/util/SocketConnectException.html"));
		urls.put(javax.mail.AuthenticationFailedException.class,
				AEM_DOMAIN.concat("javax/mail/AuthenticationFailedException.html"));
		urls.put(javax.mail.FolderClosedException.class, AEM_DOMAIN.concat("javax/mail/FolderClosedException.html"));
		urls.put(javax.mail.FolderNotFoundException.class,
				AEM_DOMAIN.concat("javax/mail/FolderNotFoundException.html"));
		urls.put(javax.mail.IllegalWriteException.class, AEM_DOMAIN.concat("javax/mail/IllegalWriteException.html"));
		urls.put(javax.mail.MessageRemovedException.class,
				AEM_DOMAIN.concat("javax/mail/MessageRemovedException.html"));
		urls.put(javax.mail.MessagingException.class, AEM_DOMAIN.concat("javax/mail/MessagingException.html"));
		urls.put(javax.mail.MethodNotSupportedException.class,
				AEM_DOMAIN.concat("javax/mail/MethodNotSupportedException.html"));
		urls.put(javax.mail.NoSuchProviderException.class,
				AEM_DOMAIN.concat("javax/mail/NoSuchProviderException.html"));
		urls.put(javax.mail.ReadOnlyFolderException.class,
				AEM_DOMAIN.concat("javax/mail/ReadOnlyFolderException.html"));
		urls.put(javax.mail.SendFailedException.class, AEM_DOMAIN.concat("javax/mail/SendFailedException.html"));
		urls.put(javax.mail.StoreClosedException.class, AEM_DOMAIN.concat("javax/mail/StoreClosedException.html"));
		urls.put(javax.mail.internet.AddressException.class,
				AEM_DOMAIN.concat("javax/mail/internet/AddressException.html"));
		urls.put(javax.mail.internet.ParseException.class,
				AEM_DOMAIN.concat("javax/mail/internet/ParseException.html"));
		urls.put(javax.mail.search.SearchException.class, AEM_DOMAIN.concat("javax/mail/search/SearchException.html"));
		urls.put(opennlp.tools.util.InvalidFormatException.class,
				AEM_DOMAIN.concat("opennlp/tools/util/InvalidFormatException.html"));
		urls.put(opennlp.tools.util.ext.ExtensionNotLoadedException.class,
				AEM_DOMAIN.concat("opennlp/tools/util/ext/ExtensionNotLoadedException.html"));
		
		urls.put(org.apache.commons.codec.DecoderException.class,
				AEM_DOMAIN.concat("org/apache/commons/codec/DecoderException.html"));
		urls.put(org.apache.commons.codec.EncoderException.class,
				AEM_DOMAIN.concat("org/apache/commons/codec/EncoderException.html"));
		
		urls.put(org.apache.commons.collections4.FunctorException.class,
				AEM_DOMAIN.concat("org/apache/commons/collections4/FunctorException.html"));
		urls.put(org.apache.commons.compress.MemoryLimitException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/MemoryLimitException.html"));
		urls.put(org.apache.commons.compress.PasswordRequiredException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/PasswordRequiredException.html"));
		urls.put(org.apache.commons.compress.archivers.ArchiveException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/ArchiveException.html"));
		urls.put(org.apache.commons.compress.archivers.StreamingNotSupportedException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/StreamingNotSupportedException.html"));
		urls.put(org.apache.commons.compress.archivers.dump.DumpArchiveException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/dump/DumpArchiveException.html"));
		urls.put(org.apache.commons.compress.archivers.dump.InvalidFormatException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/dump/InvalidFormatException.html"));
		urls.put(org.apache.commons.compress.archivers.dump.ShortFileException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/dump/ShortFileException.html"));
		urls.put(org.apache.commons.compress.archivers.dump.UnrecognizedFormatException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/dump/UnrecognizedFormatException.html"));
		urls.put(org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException.class, AEM_DOMAIN
				.concat("org/apache/commons/compress/archivers/dump/UnsupportedCompressionAlgorithmException.html"));
		urls.put(org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/zip/UnsupportedZipFeatureException.html"));
		urls.put(org.apache.commons.compress.archivers.zip.Zip64RequiredException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/archivers/zip/Zip64RequiredException.html"));
		urls.put(org.apache.commons.compress.compressors.CompressorException.class,
				AEM_DOMAIN.concat("org/apache/commons/compress/compressors/CompressorException.html"));
		urls.put(org.apache.commons.exec.ExecuteException.class,
				AEM_DOMAIN.concat("org/apache/commons/exec/ExecuteException.html"));
		urls.put(org.apache.commons.fileupload.FileItemStream.ItemSkippedException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileItemStream.ItemSkippedException.html"));
		urls.put(org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.FileSizeLimitExceededException.html"));
		urls.put(org.apache.commons.fileupload.FileUploadBase.FileUploadIOException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.FileUploadIOException.html"));
		urls.put(org.apache.commons.fileupload.FileUploadBase.IOFileUploadException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.IOFileUploadException.html"));
		urls.put(org.apache.commons.fileupload.FileUploadBase.InvalidContentTypeException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.InvalidContentTypeException.html"));
		urls.put(org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.SizeLimitExceededException.html"));
		
		urls.put(org.apache.commons.fileupload.FileUploadException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadException.html"));
		urls.put(org.apache.commons.fileupload.InvalidFileNameException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/InvalidFileNameException.html"));
		urls.put(org.apache.commons.fileupload.MultipartStream.IllegalBoundaryException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/MultipartStream.IllegalBoundaryException.html"));
		urls.put(org.apache.commons.fileupload.MultipartStream.MalformedStreamException.class,
				AEM_DOMAIN.concat("org/apache/commons/fileupload/MultipartStream.MalformedStreamException.html"));
		urls.put(org.apache.commons.imaging.ImageReadException.class,
				AEM_DOMAIN.concat("org/apache/commons/imaging/ImageReadException.html"));
		urls.put(org.apache.commons.imaging.ImageWriteException.class,
				AEM_DOMAIN.concat("org/apache/commons/imaging/ImageWriteException.html"));
		urls.put(org.apache.commons.imaging.ImagingException.class,
				AEM_DOMAIN.concat("org/apache/commons/imaging/ImagingException.html"));
		
		urls.put(org.apache.commons.io.FileExistsException.class,
				AEM_DOMAIN.concat("org/apache/commons/io/FileExistsException.html"));
		urls.put(org.apache.commons.io.TaggedIOException.class,
				AEM_DOMAIN.concat("org/apache/commons/io/TaggedIOException.html"));
		urls.put(org.apache.commons.io.input.XmlStreamReaderException.class,
				AEM_DOMAIN.concat("org/apache/commons/io/input/XmlStreamReaderException.html"));
		
		urls.put(org.apache.commons.lang3.NotImplementedException.class,
				AEM_DOMAIN.concat("org/apache/commons/lang3/NotImplementedException.html"));
		urls.put(org.apache.commons.lang3.SerializationException.class,
				AEM_DOMAIN.concat("org/apache/commons/lang3/SerializationException.html"));
		urls.put(org.apache.commons.lang3.concurrent.CircuitBreakingException.class,
				AEM_DOMAIN.concat("org/apache/commons/lang3/concurrent/CircuitBreakingException.html"));
		urls.put(org.apache.commons.lang3.concurrent.ConcurrentException.class,
				AEM_DOMAIN.concat("org/apache/commons/lang3/concurrent/ConcurrentException.html"));
		urls.put(org.apache.commons.lang3.concurrent.ConcurrentRuntimeException.class,
				AEM_DOMAIN.concat("org/apache/commons/lang3/concurrent/ConcurrentRuntimeException.html"));
		urls.put(org.apache.commons.lang3.exception.CloneFailedException.class,
				AEM_DOMAIN.concat("org/apache/commons/lang3/exception/CloneFailedException.html"));
		urls.put(org.apache.commons.lang3.exception.ContextedException.class,
				AEM_DOMAIN.concat("org/apache/commons/lang3/exception/ContextedException.html"));
		urls.put(org.apache.commons.lang3.exception.ContextedRuntimeException.class,
				AEM_DOMAIN.concat("org/apache/commons/lang3/exception/ContextedRuntimeException.html"));
		urls.put(org.apache.commons.logging.LogConfigurationException.class,
				AEM_DOMAIN.concat("org/apache/commons/logging/LogConfigurationException.html"));
		urls.put(org.apache.commons.mail.EmailException.class,
				AEM_DOMAIN.concat("org/apache/commons/mail/EmailException.html"));
		urls.put(org.apache.commons.math.ArgumentOutsideDomainException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/ArgumentOutsideDomainException.html"));
		urls.put(org.apache.commons.math.ConvergenceException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/ConvergenceException.html"));
		
		urls.put(org.apache.commons.math.DuplicateSampleAbscissaException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/DuplicateSampleAbscissaException.html"));
		urls.put(org.apache.commons.math.FunctionEvaluationException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/FunctionEvaluationException.html"));
		urls.put(org.apache.commons.math.MathConfigurationException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/MathConfigurationException.html"));
		urls.put(org.apache.commons.math.MathException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/MathException.html"));
		urls.put(org.apache.commons.math.MathRuntimeException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/MathRuntimeException.html"));
		urls.put(org.apache.commons.math.MaxEvaluationsExceededException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/MaxEvaluationsExceededException.html"));
		urls.put(org.apache.commons.math.MaxIterationsExceededException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/MaxIterationsExceededException.html"));
		
		urls.put(org.apache.commons.math.exception.ConvergenceException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/ConvergenceException.html"));
		urls.put(org.apache.commons.math.exception.DimensionMismatchException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/DimensionMismatchException.html"));
		urls.put(org.apache.commons.math.exception.MathIllegalArgumentException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/MathIllegalArgumentException.html"));
		urls.put(org.apache.commons.math.exception.MathIllegalNumberException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/MathIllegalNumberException.html"));
		urls.put(org.apache.commons.math.exception.MathIllegalStateException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/MathIllegalStateException.html"));
		urls.put(org.apache.commons.math.exception.MathUnsupportedOperationException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/MathUnsupportedOperationException.html"));
		urls.put(org.apache.commons.math.exception.NoDataException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NoDataException.html"));
		urls.put(org.apache.commons.math.exception.NonMonotonousSequenceException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NonMonotonousSequenceException.html"));
		urls.put(org.apache.commons.math.exception.NotPositiveException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NotPositiveException.html"));
		urls.put(org.apache.commons.math.exception.NotStrictlyPositiveException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NotStrictlyPositiveException.html"));
		urls.put(org.apache.commons.math.exception.NullArgumentException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NullArgumentException.html"));
		urls.put(org.apache.commons.math.exception.NumberIsTooLargeException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NumberIsTooLargeException.html"));
		urls.put(org.apache.commons.math.exception.NumberIsTooSmallException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/NumberIsTooSmallException.html"));
		urls.put(org.apache.commons.math.exception.OutOfRangeException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/OutOfRangeException.html"));
		urls.put(org.apache.commons.math.exception.ZeroException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/exception/ZeroException.html"));
		urls.put(org.apache.commons.math.fraction.FractionConversionException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/fraction/FractionConversionException.html"));
		urls.put(org.apache.commons.math.genetics.InvalidRepresentationException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/genetics/InvalidRepresentationException.html"));
		urls.put(org.apache.commons.math.geometry.CardanEulerSingularityException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/geometry/CardanEulerSingularityException.html"));
		urls.put(org.apache.commons.math.geometry.NotARotationMatrixException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/geometry/NotARotationMatrixException.html"));
		urls.put(org.apache.commons.math.linear.InvalidMatrixException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/linear/InvalidMatrixException.html"));
		urls.put(org.apache.commons.math.linear.MatrixIndexException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/linear/MatrixIndexException.html"));
		urls.put(org.apache.commons.math.linear.MatrixVisitorException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/linear/MatrixVisitorException.html"));
		urls.put(org.apache.commons.math.linear.NonSquareMatrixException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/linear/NonSquareMatrixException.html"));
		urls.put(org.apache.commons.math.linear.NotPositiveDefiniteMatrixException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/linear/NotPositiveDefiniteMatrixException.html"));
		urls.put(org.apache.commons.math.linear.NotSymmetricMatrixException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/linear/NotSymmetricMatrixException.html"));
		urls.put(org.apache.commons.math.linear.SingularMatrixException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/linear/SingularMatrixException.html"));
		urls.put(org.apache.commons.math.ode.DerivativeException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/ode/DerivativeException.html"));
		urls.put(org.apache.commons.math.ode.IntegratorException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/ode/IntegratorException.html"));
		urls.put(org.apache.commons.math.ode.events.EventException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/ode/events/EventException.html"));
		
		urls.put(org.apache.commons.math.optimization.linear.NoFeasibleSolutionException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/optimization/linear/NoFeasibleSolutionException.html"));
		urls.put(org.apache.commons.math.optimization.linear.UnboundedSolutionException.class,
				AEM_DOMAIN.concat("org/apache/commons/math/optimization/linear/UnboundedSolutionException.html"));
		urls.put(org.apache.jackrabbit.api.ReferenceBinaryException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/api/ReferenceBinaryException.html"));
		urls.put(org.apache.jackrabbit.api.security.user.AuthorizableExistsException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/api/security/user/AuthorizableExistsException.html"));
		urls.put(org.apache.jackrabbit.api.security.user.AuthorizableTypeException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/api/security/user/AuthorizableTypeException.html"));
		urls.put(org.apache.jackrabbit.commons.cnd.ParseException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/commons/cnd/ParseException.html"));
		urls.put(org.apache.jackrabbit.core.config.ConfigurationException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/core/config/ConfigurationException.html"));
		urls.put(org.apache.jackrabbit.core.data.DataStoreException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/core/data/DataStoreException.html"));
		urls.put(org.apache.jackrabbit.core.fs.FileSystemException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/core/fs/FileSystemException.html"));
		urls.put(org.apache.jackrabbit.data.core.TransactionException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/data/core/TransactionException.html"));
		urls.put(org.apache.jackrabbit.oak.api.CommitFailedException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/oak/api/CommitFailedException.html"));
		urls.put(org.apache.jackrabbit.oak.api.IllegalRepositoryStateException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/oak/api/IllegalRepositoryStateException.html"));
		urls.put(org.apache.jackrabbit.oak.spi.security.authentication.external.ExternalIdentityException.class,
				AEM_DOMAIN.concat(
						"org/apache/jackrabbit/oak/spi/security/authentication/external/ExternalIdentityException.html"));
		urls.put(org.apache.jackrabbit.oak.spi.security.authentication.external.SyncException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/oak/spi/security/authentication/external/SyncException.html"));
		urls.put(org.apache.jackrabbit.spi.commons.conversion.IllegalNameException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/conversion/IllegalNameException.html"));
		urls.put(org.apache.jackrabbit.spi.commons.conversion.MalformedPathException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/conversion/MalformedPathException.html"));
		urls.put(org.apache.jackrabbit.spi.commons.conversion.NameException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/conversion/NameException.html"));
		urls.put(org.apache.jackrabbit.spi.commons.nodetype.InvalidConstraintException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/nodetype/InvalidConstraintException.html"));
		urls.put(org.apache.jackrabbit.spi.commons.nodetype.NodeTypeConflictException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/nodetype/NodeTypeConflictException.html"));
		urls.put(org.apache.jackrabbit.spi.commons.privilege.ParseException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/privilege/ParseException.html"));
		urls.put(org.apache.jackrabbit.spi.commons.query.sql.ParseException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/query/sql/ParseException.html"));
		urls.put(org.apache.jackrabbit.spi.commons.query.xpath.ParseException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/spi/commons/query/xpath/ParseException.html"));
		urls.put(org.apache.jackrabbit.vault.fs.config.ConfigurationException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/fs/config/ConfigurationException.html"));
		urls.put(org.apache.jackrabbit.vault.packaging.CyclicDependencyException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/CyclicDependencyException.html"));
		urls.put(org.apache.jackrabbit.vault.packaging.DependencyException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/DependencyException.html"));
		urls.put(org.apache.jackrabbit.vault.packaging.NoSuchPackageException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/NoSuchPackageException.html"));
		urls.put(org.apache.jackrabbit.vault.packaging.PackageException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/PackageException.html"));
		urls.put(org.apache.jackrabbit.vault.packaging.PackageExistsException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/packaging/PackageExistsException.html"));
		urls.put(org.apache.jackrabbit.vault.util.xml.xerces.xni.XNIException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/util/xml/xerces/xni/XNIException.html"));
		urls.put(org.apache.jackrabbit.vault.util.xml.xerces.xni.parser.XMLParseException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/vault/util/xml/xerces/xni/parser/XMLParseException.html"));
		urls.put(org.apache.jackrabbit.webdav.DavException.class,
				AEM_DOMAIN.concat("org/apache/jackrabbit/webdav/DavException.html"));
		urls.put(org.apache.oltu.oauth2.common.exception.OAuthProblemException.class,
				AEM_DOMAIN.concat("org/apache/oltu/oauth2/common/exception/OAuthProblemException.html"));
		urls.put(org.apache.oltu.oauth2.common.exception.OAuthRuntimeException.class,
				AEM_DOMAIN.concat("org/apache/oltu/oauth2/common/exception/OAuthRuntimeException.html"));
		urls.put(org.apache.oltu.oauth2.common.exception.OAuthSystemException.class,
				AEM_DOMAIN.concat("org/apache/oltu/oauth2/common/exception/OAuthSystemException.html"));
		urls.put(org.apache.sling.api.SlingException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/SlingException.html"));
		urls.put(org.apache.sling.api.SlingIOException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/SlingIOException.html"));
		urls.put(org.apache.sling.api.SlingServletException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/SlingServletException.html"));
		urls.put(org.apache.sling.api.auth.NoAuthenticationHandlerException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/auth/NoAuthenticationHandlerException.html"));
		urls.put(org.apache.sling.api.request.RecursionTooDeepException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/request/RecursionTooDeepException.html"));
		urls.put(org.apache.sling.api.request.TooManyCallsException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/request/TooManyCallsException.html"));
		urls.put(org.apache.sling.api.resource.LoginException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/resource/LoginException.html"));
		urls.put(org.apache.sling.api.resource.PersistenceException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/resource/PersistenceException.html"));
		urls.put(org.apache.sling.api.resource.QuerySyntaxException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/resource/QuerySyntaxException.html"));
		urls.put(org.apache.sling.api.resource.ResourceNotFoundException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/resource/ResourceNotFoundException.html"));
		urls.put(org.apache.sling.api.scripting.InvalidServiceFilterSyntaxException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/scripting/InvalidServiceFilterSyntaxException.html"));
		urls.put(org.apache.sling.api.scripting.ScriptEvaluationException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/scripting/ScriptEvaluationException.html"));
		urls.put(org.apache.sling.api.security.AccessSecurityException.class,
				AEM_DOMAIN.concat("org/apache/sling/api/security/AccessSecurityException.html"));
		urls.put(org.apache.sling.caconfig.ConfigurationResolveException.class,
				AEM_DOMAIN.concat("org/apache/sling/caconfig/ConfigurationResolveException.html"));
		urls.put(org.apache.sling.caconfig.spi.ConfigurationPersistenceAccessDeniedException.class,
				AEM_DOMAIN.concat("org/apache/sling/caconfig/spi/ConfigurationPersistenceAccessDeniedException.html"));
		urls.put(org.apache.sling.caconfig.spi.ConfigurationPersistenceException.class,
				AEM_DOMAIN.concat("org/apache/sling/caconfig/spi/ConfigurationPersistenceException.html"));
		
		urls.put(org.apache.sling.distribution.common.DistributionException.class,
				AEM_DOMAIN.concat("org/apache/sling/distribution/common/DistributionException.html"));
		urls.put(org.apache.sling.distribution.common.RecoverableDistributionException.class,
				AEM_DOMAIN.concat("org/apache/sling/distribution/common/RecoverableDistributionException.html"));
		
		urls.put(org.apache.sling.hapi.HApiException.class,
				AEM_DOMAIN.concat("org/apache/sling/hapi/HApiException.html"));
		
		urls.put(org.apache.sling.models.factory.ExportException.class,
				AEM_DOMAIN.concat("org/apache/sling/models/factory/ExportException.html"));
		urls.put(org.apache.sling.models.factory.InvalidAdaptableException.class,
				AEM_DOMAIN.concat("org/apache/sling/models/factory/InvalidAdaptableException.html"));
		urls.put(org.apache.sling.models.factory.InvalidModelException.class,
				AEM_DOMAIN.concat("org/apache/sling/models/factory/InvalidModelException.html"));
		urls.put(org.apache.sling.models.factory.MissingElementException.class,
				AEM_DOMAIN.concat("org/apache/sling/models/factory/MissingElementException.html"));
		urls.put(org.apache.sling.models.factory.MissingElementsException.class,
				AEM_DOMAIN.concat("org/apache/sling/models/factory/MissingElementsException.html"));
		urls.put(org.apache.sling.models.factory.MissingExporterException.class,
				AEM_DOMAIN.concat("org/apache/sling/models/factory/MissingExporterException.html"));
		urls.put(org.apache.sling.models.factory.ModelClassException.class,
				AEM_DOMAIN.concat("org/apache/sling/models/factory/ModelClassException.html"));
		urls.put(org.apache.sling.models.factory.PostConstructException.class,
				AEM_DOMAIN.concat("org/apache/sling/models/factory/PostConstructException.html"));
		urls.put(org.apache.sling.models.factory.ValidationException.class,
				AEM_DOMAIN.concat("org/apache/sling/models/factory/ValidationException.html"));
		urls.put(org.apache.sling.scripting.sightly.SightlyException.class,
				AEM_DOMAIN.concat("org/apache/sling/scripting/sightly/SightlyException.html"));
		urls.put(org.apache.sling.scripting.sightly.compiler.SightlyCompilerException.class,
				AEM_DOMAIN.concat("org/apache/sling/scripting/sightly/compiler/SightlyCompilerException.html"));
		urls.put(org.apache.sling.scripting.sightly.java.compiler.SightlyJavaCompilerException.class, AEM_DOMAIN
				.concat("org/apache/sling/scripting/sightly/java/compiler/SightlyJavaCompilerException.html"));
		urls.put(org.apache.tika.exception.AccessPermissionException.class,
				AEM_DOMAIN.concat("org/apache/tika/exception/AccessPermissionException.html"));
		urls.put(org.apache.tika.exception.CorruptedFileException.class,
				AEM_DOMAIN.concat("org/apache/tika/exception/CorruptedFileException.html"));
		urls.put(org.apache.tika.exception.EncryptedDocumentException.class,
				AEM_DOMAIN.concat("org/apache/tika/exception/EncryptedDocumentException.html"));
		urls.put(org.apache.tika.exception.TikaConfigException.class,
				AEM_DOMAIN.concat("org/apache/tika/exception/TikaConfigException.html"));
		urls.put(org.apache.tika.exception.TikaException.class,
				AEM_DOMAIN.concat("org/apache/tika/exception/TikaException.html"));
		urls.put(org.apache.tika.exception.TikaMemoryLimitException.class,
				AEM_DOMAIN.concat("org/apache/tika/exception/TikaMemoryLimitException.html"));
		urls.put(org.apache.tika.exception.UnsupportedFormatException.class,
				AEM_DOMAIN.concat("org/apache/tika/exception/UnsupportedFormatException.html"));
		urls.put(org.apache.tika.exception.ZeroByteFileException.class,
				AEM_DOMAIN.concat("org/apache/tika/exception/ZeroByteFileException.html"));
		urls.put(org.apache.tika.io.EndianUtils.BufferUnderrunException.class,
				AEM_DOMAIN.concat("org/apache/tika/io/EndianUtils.BufferUnderrunException.html"));
		urls.put(org.apache.tika.io.TaggedIOException.class,
				AEM_DOMAIN.concat("org/apache/tika/io/TaggedIOException.html"));
		urls.put(org.apache.tika.metadata.PropertyTypeException.class,
				AEM_DOMAIN.concat("org/apache/tika/metadata/PropertyTypeException.html"));
		urls.put(org.apache.tika.mime.MimeTypeException.class,
				AEM_DOMAIN.concat("org/apache/tika/mime/MimeTypeException.html"));
		urls.put(org.apache.tika.parser.chm.exception.ChmParsingException.class,
				AEM_DOMAIN.concat("org/apache/tika/parser/chm/exception/ChmParsingException.html"));
		urls.put(org.apache.tika.parser.utils.DataURISchemeParseException.class,
				AEM_DOMAIN.concat("org/apache/tika/parser/utils/DataURISchemeParseException.html"));
		urls.put(org.apache.tika.sax.TaggedSAXException.class,
				AEM_DOMAIN.concat("org/apache/tika/sax/TaggedSAXException.html"));
		urls.put(org.joda.time.IllegalFieldValueException.class, AEM_DOMAIN.concat("org/joda/time/IllegalFieldValueException.html"));
		urls.put(org.joda.time.IllegalInstantException.class,
				AEM_DOMAIN.concat("org/joda/time/IllegalInstantException.html"));
		urls.put(org.kohsuke.rngom.rngparser.ast.builder.BuildException.class,
				AEM_DOMAIN.concat("org/kohsuke/rngom/rngparser/ast/builder/BuildException.html"));
		urls.put(org.kohsuke.rngom.rngparser.parse.IllegalSchemaException.class,
				AEM_DOMAIN.concat("org/kohsuke/rngom/rngparser/parse/IllegalSchemaException.html"));
		urls.put(org.kohsuke.rngom.rngparser.parse.compact.EOFException.class,
				AEM_DOMAIN.concat("org/kohsuke/rngom/rngparser/parse/compact/EOFException.html"));
		urls.put(org.mozilla.classfile.ClassFileWriter.ClassFileFormatException.class,
				AEM_DOMAIN.concat("org/mozilla/classfile/ClassFileWriter.ClassFileFormatException.html"));
		urls.put(org.mozilla.javascript.EvaluatorException.class,
				AEM_DOMAIN.concat("org/mozilla/javascript/EvaluatorException.html"));
		urls.put(org.mozilla.javascript.JavaScriptException.class,
				AEM_DOMAIN.concat("org/mozilla/javascript/JavaScriptException.html"));
		urls.put(org.mozilla.javascript.NativeGenerator.GeneratorClosedException.class,
				AEM_DOMAIN.concat("org/mozilla/javascript/NativeGenerator.GeneratorClosedException.html"));
		urls.put(org.mozilla.javascript.RhinoException.class,
				AEM_DOMAIN.concat("org/mozilla/javascript/RhinoException.html"));
		urls.put(org.mozilla.javascript.WrappedException.class,
				AEM_DOMAIN.concat("org/mozilla/javascript/WrappedException.html"));
		urls.put(org.mozilla.javascript.json.JsonParser.ParseException.class,
				AEM_DOMAIN.concat("org/mozilla/javascript/json/JsonParser.ParseException.html"));
		urls.put(org.osgi.util.converter.ConversionException.class,
				AEM_DOMAIN.concat("org/osgi/util/converter/ConversionException.html"));
		urls.put(org.osgi.util.promise.FailedPromisesException.class,
				AEM_DOMAIN.concat("org/osgi/util/promise/FailedPromisesException.html"));
		urls.put(org.osgi.util.promise.TimeoutException.class,
				AEM_DOMAIN.concat("org/osgi/util/promise/TimeoutException.html"));
		
//		Deprecated
		urls.put(ch.qos.logback.core.LogbackException.class, AEM_DOMAIN.concat("ch/qos/logback/core/LogbackException.html"));
		urls.put(ch.qos.logback.core.boolex.EvaluationException.class,AEM_DOMAIN.concat("ch/qos/logback/core/boolex/EvaluationException.html"));
		urls.put(ch.qos.logback.core.joran.spi.ActionException.class,AEM_DOMAIN.concat("ch/qos/logback/core/joran/spi/ActionException.html"));
		urls.put(ch.qos.logback.core.joran.spi.JoranException.class,AEM_DOMAIN.concat("ch/qos/logback/core/joran/spi/JoranException.html"));
		urls.put(ch.qos.logback.core.spi.ScanException.class,AEM_DOMAIN.concat("ch/qos/logback/core/spi/ScanException.html"));
		urls.put(ch.qos.logback.core.util.DynamicClassLoadingException.class,AEM_DOMAIN.concat("ch/qos/logback/core/util/DynamicClassLoadingException.html"));
		urls.put(ch.qos.logback.core.util.IncompatibleClassException.class,AEM_DOMAIN.concat("ch/qos/logback/core/util/IncompatibleClassException.html"));
		urls.put(ch.qos.logback.core.util.PropertySetterException.class,AEM_DOMAIN.concat("ch/qos/logback/core/util/PropertySetterException.html"));
		urls.put(com.adobe.cq.address.api.AddressException.class, AEM_DOMAIN.concat("com/adobe/cq/address/api/AddressException.html"));
		urls.put(com.adobe.granite.offloading.api.OffloadingException.class, AEM_DOMAIN.concat("com/adobe/granite/offloading/api/OffloadingException.html"));
		urls.put(com.day.cq.searchpromote.SearchPromoteException.class,AEM_DOMAIN.concat("com/day/cq/searchpromote/SearchPromoteException.html"));
		urls.put(com.day.cq.security.AuthorizableExistsException.class,AEM_DOMAIN.concat("com/day/cq/security/AuthorizableExistsException.html"));
		urls.put(com.day.cq.security.CqSecurityException.class,AEM_DOMAIN.concat("com/day/cq/security/CqSecurityException.html"));
		urls.put(com.day.cq.security.NoSuchAuthorizableException.class,AEM_DOMAIN.concat("com/day/cq/security/NoSuchAuthorizableException.html"));
		urls.put(com.day.cq.security.NoSuchPrivilegeException.class,AEM_DOMAIN.concat("com/day/cq/security/NoSuchPrivilegeException.html"));
		urls.put(com.day.cq.xss.XSSProtectionException.class, AEM_DOMAIN.concat("com/day/cq/xss/XSSProtectionException.html"));
		urls.put(com.mongodb.BulkWriteException.class, AEM_DOMAIN.concat("com/mongodb/BulkWriteException.html"));
		urls.put(com.mongodb.DuplicateKeyException.class, AEM_DOMAIN.concat("com/mongodb/DuplicateKeyException.html"));
		urls.put(com.mongodb.MongoBulkWriteException.class, AEM_DOMAIN.concat("com/mongodb/MongoBulkWriteException.html"));
		urls.put(com.mongodb.MongoChangeStreamException.class, AEM_DOMAIN.concat("com/mongodb/MongoChangeStreamException.html"));
		urls.put(com.mongodb.MongoClientException.class, AEM_DOMAIN.concat("com/mongodb/MongoClientException.html"));
		urls.put(com.mongodb.MongoCommandException.class, AEM_DOMAIN.concat("com/mongodb/MongoCommandException.html"));
		urls.put(com.mongodb.MongoConfigurationException.class, AEM_DOMAIN.concat("com/mongodb/MongoConfigurationException.html"));
		urls.put(com.mongodb.MongoCursorNotFoundException.class, AEM_DOMAIN.concat("com/mongodb/MongoCursorNotFoundException.html"));
		urls.put(com.mongodb.MongoException.class, AEM_DOMAIN.concat("com/mongodb/MongoException.html"));
		urls.put(com.mongodb.MongoExecutionTimeoutException.class, AEM_DOMAIN.concat("com/mongodb/MongoExecutionTimeoutException.html"));
		urls.put(com.mongodb.MongoGridFSException.class, AEM_DOMAIN.concat("com/mongodb/MongoGridFSException.html"));
		urls.put(com.mongodb.MongoIncompatibleDriverException.class, AEM_DOMAIN.concat("com/mongodb/MongoIncompatibleDriverException.html"));
		urls.put(com.mongodb.MongoInternalException.class, AEM_DOMAIN.concat("com/mongodb/MongoInternalException.html"));
		urls.put(com.mongodb.MongoInterruptedException.class, AEM_DOMAIN.concat("com/mongodb/MongoInterruptedException.html"));
		urls.put(com.mongodb.MongoNodeIsRecoveringException.class, AEM_DOMAIN.concat("com/mongodb/MongoNodeIsRecoveringException.html"));
		urls.put(com.mongodb.MongoNotPrimaryException.class, AEM_DOMAIN.concat("com/mongodb/MongoNotPrimaryException.html"));
		urls.put(com.mongodb.MongoQueryException.class, AEM_DOMAIN.concat("com/mongodb/MongoQueryException.html"));
		urls.put(com.mongodb.MongoSecurityException.class, AEM_DOMAIN.concat("com/mongodb/MongoSecurityException.html"));
		urls.put(com.mongodb.MongoServerException.class, AEM_DOMAIN.concat("com/mongodb/MongoServerException.html"));
		urls.put(com.mongodb.MongoSocketClosedException.class, AEM_DOMAIN.concat("com/mongodb/MongoSocketClosedException.html"));
		urls.put(com.mongodb.MongoSocketException.class, AEM_DOMAIN.concat("com/mongodb/MongoSocketException.html"));
		urls.put(com.mongodb.MongoSocketOpenException.class, AEM_DOMAIN.concat("com/mongodb/MongoSocketOpenException.html"));
		urls.put(com.mongodb.MongoSocketReadException.class, AEM_DOMAIN.concat("com/mongodb/MongoSocketReadException.html"));
		urls.put(com.mongodb.MongoSocketReadTimeoutException.class, AEM_DOMAIN.concat("com/mongodb/MongoSocketReadTimeoutException.html"));
		urls.put(com.mongodb.MongoSocketWriteException.class, AEM_DOMAIN.concat("com/mongodb/MongoSocketWriteException.html"));
		urls.put(com.mongodb.MongoTimeoutException.class, AEM_DOMAIN.concat("com/mongodb/MongoTimeoutException.html"));
		urls.put(com.mongodb.MongoWaitQueueFullException.class, AEM_DOMAIN.concat("com/mongodb/MongoWaitQueueFullException.html"));
		urls.put(com.mongodb.MongoWriteConcernException.class, AEM_DOMAIN.concat("com/mongodb/MongoWriteConcernException.html"));
		urls.put(com.mongodb.MongoWriteException.class, AEM_DOMAIN.concat("com/mongodb/MongoWriteException.html"));
		urls.put(com.mongodb.WriteConcernException.class, AEM_DOMAIN.concat("com/mongodb/WriteConcernException.html"));
		urls.put(com.mongodb.internal.connection.MongoWriteConcernWithResponseException.class, AEM_DOMAIN.concat("com/mongodb/internal/connection/MongoWriteConcernWithResponseException.html"));
		urls.put(com.mongodb.util.JSONParseException.class, AEM_DOMAIN.concat("com/mongodb/util/JSONParseException.html"));
		urls.put(org.apache.abdera.i18n.iri.IRISyntaxException.class, AEM_DOMAIN.concat("org/apache/abdera/i18n/iri/IRISyntaxException.html"));
		urls.put(org.apache.abdera.i18n.text.InvalidCharacterException.class, AEM_DOMAIN.concat("org/apache/abdera/i18n/text/InvalidCharacterException.html"));
		urls.put(org.apache.abdera.util.MimeTypeParseException.class, AEM_DOMAIN.concat("org/apache/abdera/util/MimeTypeParseException.html"));
		urls.put(org.apache.abdera.xpath.XPathException.class, AEM_DOMAIN.concat("org/apache/abdera/xpath/XPathException.html"));
		urls.put(org.apache.commons.collections.BufferOverflowException.class, AEM_DOMAIN.concat("org/apache/commons/collections/BufferOverflowException.html"));
		urls.put(org.apache.commons.collections.BufferUnderflowException.class, AEM_DOMAIN.concat("org/apache/commons/collections/BufferUnderflowException.html"));
		urls.put(org.apache.commons.collections.FunctorException.class, AEM_DOMAIN.concat("org/apache/commons/collections/FunctorException.html"));
		urls.put(org.apache.commons.io.DirectoryWalker.CancelException.class, AEM_DOMAIN.concat("org/apache/commons/io/DirectoryWalker.CancelException.html"));
		urls.put(org.apache.commons.fileupload.FileUploadBase.UnknownSizeException.class, AEM_DOMAIN.concat("org/apache/commons/fileupload/FileUploadBase.UnknownSizeException.html"));
		urls.put(org.apache.commons.lang.IllegalClassException.class, AEM_DOMAIN.concat("org/apache/commons/lang/IllegalClassException.html"));
		urls.put(org.apache.commons.lang.IncompleteArgumentException.class, AEM_DOMAIN.concat("org/apache/commons/lang/IncompleteArgumentException.html"));
		urls.put(org.apache.commons.lang.NotImplementedException.class, AEM_DOMAIN.concat("org/apache/commons/lang/NotImplementedException.html"));
		urls.put(org.apache.commons.lang.NullArgumentException.class, AEM_DOMAIN.concat("org/apache/commons/lang/NullArgumentException.html"));
		urls.put(org.apache.commons.lang.SerializationException.class, AEM_DOMAIN.concat("org/apache/commons/lang/SerializationException.html"));
		urls.put(org.apache.commons.lang.UnhandledException.class, AEM_DOMAIN.concat("org/apache/commons/lang/UnhandledException.html"));
		urls.put(org.apache.commons.lang.exception.CloneFailedException.class, AEM_DOMAIN.concat("org/apache/commons/lang/exception/CloneFailedException.html"));
		urls.put(org.apache.commons.lang.exception.NestableException.class, AEM_DOMAIN.concat("org/apache/commons/lang/exception/NestableException.html"));
		urls.put(org.apache.commons.lang.exception.NestableRuntimeException.class, AEM_DOMAIN.concat("org/apache/commons/lang/exception/NestableRuntimeException.html"));
		urls.put(org.apache.commons.math.DimensionMismatchException.class, AEM_DOMAIN.concat("org/apache/commons/math/DimensionMismatchException.html"));
		urls.put(org.apache.commons.math.estimation.EstimationException.class, AEM_DOMAIN.concat("org/apache/commons/math/estimation/EstimationException.html"));
		urls.put(org.apache.commons.math.optimization.OptimizationException.class, AEM_DOMAIN.concat("org/apache/commons/math/optimization/OptimizationException.html"));
		urls.put(org.apache.sling.commons.auth.NoAuthenticationHandlerException.class, AEM_DOMAIN.concat("org/apache/sling/commons/auth/NoAuthenticationHandlerException.html"));
		urls.put(org.apache.sling.commons.json.JSONException.class, AEM_DOMAIN.concat("org/apache/sling/commons/json/JSONException.html"));
		urls.put(org.apache.sling.engine.auth.NoAuthenticationHandlerException.class, AEM_DOMAIN.concat("org/apache/sling/engine/auth/NoAuthenticationHandlerException.html"));
		urls.put(org.apache.sling.jcr.api.TooManySessionsException.class, AEM_DOMAIN.concat("org/apache/sling/jcr/api/TooManySessionsException.html"));
		urls.put(org.bson.BSONException.class, AEM_DOMAIN.concat("org/bson/BSONException.html"));
		urls.put(org.bson.BsonInvalidOperationException.class, AEM_DOMAIN.concat("org/bson/BsonInvalidOperationException.html"));
		urls.put(org.bson.BsonMaximumSizeExceededException.class, AEM_DOMAIN.concat("org/bson/BsonMaximumSizeExceededException.html"));
		urls.put(org.bson.BsonSerializationException.class, AEM_DOMAIN.concat("org/bson/BsonSerializationException.html"));
		urls.put(org.bson.codecs.configuration.CodecConfigurationException.class, AEM_DOMAIN.concat("org/bson/codecs/configuration/CodecConfigurationException.html"));
		urls.put(org.bson.json.JsonParseException.class, AEM_DOMAIN.concat("org/bson/json/JsonParseException.html"));
		
		return urls;
	}

}
