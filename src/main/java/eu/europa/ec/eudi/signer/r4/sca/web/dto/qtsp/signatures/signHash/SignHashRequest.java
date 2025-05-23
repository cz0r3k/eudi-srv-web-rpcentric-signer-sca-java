/*
 Copyright 2024 European Commission

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package eu.europa.ec.eudi.signer.r4.sca.web.dto.qtsp.signatures.signHash;

import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class SignHashRequest {
    @NotBlank
    private String credentialID;
    private String SAD;
    @NotBlank
    private List<String> hashes;
    private String hashAlgorithmOID;
    @NotBlank
    private String signAlgo;
    private String signAlgoParams;
    private String operationMode;
    private int validity_period;
    private String response_uri;
    private String clientData;

    public SignHashRequest() {}

    public SignHashRequest(String credentialID, String SAD, List<String> hashes, String hashAlgorithmOID,
                           String signAlgo, String signAlgoParams, String operationMode, int validity_period, String response_uri,
                           String clientData) {
        this.credentialID = credentialID;
        this.SAD = SAD;
        this.hashes = hashes;
        this.hashAlgorithmOID = hashAlgorithmOID;
        this.signAlgo = signAlgo;
        this.signAlgoParams = signAlgoParams;
        this.operationMode = operationMode;
        this.validity_period = validity_period;
        this.response_uri = response_uri;
        this.clientData = clientData;
    }

    public String getCredentialID() {
        return credentialID;
    }

    public void setCredentialID(String credentialID) {
        this.credentialID = credentialID;
    }

    public String getSAD() {
        return SAD;
    }

    public void setSAD(String SAD) {
        this.SAD = SAD;
    }

    public List<String> getHashes() {
        return hashes;
    }

    public void setHashes(List<String> hashes) {
        this.hashes = hashes;
    }

    public String getHashAlgorithmOID() {
        return hashAlgorithmOID;
    }

    public void setHashAlgorithmOID(String hashAlgorithmOID) {
        this.hashAlgorithmOID = hashAlgorithmOID;
    }

    public String getSignAlgo() {
        return signAlgo;
    }

    public void setSignAlgo(String signAlgo) {
        this.signAlgo = signAlgo;
    }

    public String getSignAlgoParams() {
        return signAlgoParams;
    }

    public void setSignAlgoParams(String signAlgoParams) {
        this.signAlgoParams = signAlgoParams;
    }

    public String getOperationMode() {
        return operationMode;
    }

    public void setOperationMode(String operationMode) {
        this.operationMode = operationMode;
    }

    public int getValidity_period() {
        return validity_period;
    }

    public void setValidity_period(int validity_period) {
        this.validity_period = validity_period;
    }

    public String getResponse_uri() {
        return response_uri;
    }

    public void setResponse_uri(String response_uri) {
        this.response_uri = response_uri;
    }

    public String getClientData() {
        return clientData;
    }

    public void setClientData(String clientData) {
        this.clientData = clientData;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "SignaturesSignHashRequestDTO{" +
                "credentialID='" + credentialID + '\'' +
                ", SAD='" + SAD + '\'' +
                ", hashes=" + hashes +
                ", hashAlgorithmOID='" + hashAlgorithmOID + '\'' +
                ", signAlgo='" + signAlgo + '\'' +
                ", signAlgoParams='" + signAlgoParams + '\'' +
                ", operationMode='" + operationMode + '\'' +
                ", validity_period=" + validity_period +
                ", response_uri='" + response_uri + '\'' +
                ", client_Data='" + clientData + '\'' +
                '}';
    }
}
