/*
 * Copyright 2013 Michael Atkinson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.philomathery.pdf.certificate.generator;

import java.net.URI;
import java.util.Collection;

import com.philomathery.pdf.certificate.elements.CertificateElement;

/**
 * Factory for certificate instances
 */
public interface CertificateFactory
{
   /**
    * Generate and populate a {@link Certificate}.
    * 
    * @param elements
    *           the {@link CertificateElement}s to be rendered
    * @param xslt
    *           a {@link URI} representing the XSLT to be used when rendering
    *           the {@link Certificate}
    * @return a {@link Certificate} ready to be rendered
    */
   Certificate createCertificate(Collection<CertificateElement> elements, URI xslt);
}
