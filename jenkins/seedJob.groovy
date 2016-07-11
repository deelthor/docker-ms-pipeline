pipelineJob('pipeline') {
    definition {
        cps {
            script("node {\n stage 'Stage 1'\n echo 'Hello World 1'\n stage 'Stage 2'\n echo 'Hello World 2'\n}")
            sandbox()
        }
    }
}
